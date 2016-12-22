package fr.imie.poecpoei.ldap;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.SearchResult;
import javax.naming.ldap.InitialLdapContext;
import javax.naming.ldap.LdapContext;

import poec.imie.plateforme.entities.Student;
import poec.imie.plateforme.entities.User;

public class Test_ldap {
	public static void main(String[] args) {
		// Adresse du serveur sur lequel se trouve l'annuaire LDAP
		String serverIP = "192.168.3.250";
		// Port du serveur sur lequel se trouve l'annuaire LDAP
		String serverPort = "389";
		// Login de connexion à l'annuaire LDAP : Le login doit être sous forme
		// de "distinguished name"
		// ce qui signifie qu'il dois être affiché sous la forme de son
		// arborescence LDAP
		String serverLogin = "ldap_read";
		// Mot de passe de connexion à l'annuaire LDAP
		String serverPass = "Pr0jetJuJube";
		String dn = "DC=imie,DC=lan";
		// On remplis un tableau avec les parametres d'environement et de
		// connexion au LDAP
		Hashtable environnement = new Hashtable();
		environnement.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		environnement.put(Context.PROVIDER_URL, "ldap://" + serverIP + ":" + serverPort + "/" + dn);
		environnement.put(Context.SECURITY_AUTHENTICATION, "simple");
		environnement.put(Context.SECURITY_PRINCIPAL, serverLogin);
		environnement.put(Context.SECURITY_CREDENTIALS, serverPass);
		ArrayList<Student> users = new ArrayList<Student>();
		try {
			// LdapContext
			LdapContext ctx = new InitialLdapContext(environnement, null);
			// Filtre du LDAP
			NamingEnumeration<SearchResult> userAnswer = ctx.search("OU=2016-2017-JEE,OU=POEC,OU=Eleves,OU=Utilisateurs,OU=Formation,OU=RENNES,OU=Sites", null);
			// Parcourir tous les Utilisateurs
			while (userAnswer.hasMoreElements()) {
				SearchResult sr = (SearchResult) userAnswer.next();
				Attributes attrs = sr.getAttributes();
				if (attrs != null) {
					try {
						// Récupération des attributs
						String lastName = "", firstName = "", userName="";
						for (NamingEnumeration ae = attrs.getAll(); ae.hasMore();) {
							Attribute attr = (Attribute) ae.next();
							if (attr.getID().equals("sn")) {
								// System.out.println(attr.get(0).toString());
								lastName = attr.get(0).toString();
								users.add(new Student(lastName, firstName,userName));
								// System.out.println(users.toString());
							}
							if (attr.getID().equals("givenName")) {
								// System.out.println(attr.get(0).toString());
								firstName = attr.get(0).toString();
							}
							if (attr.getID().equals("givenName")) {
								//System.out.println(attr.get(0).toString());
								firstName = attr.get(0).toString();
							}
							if (attr.getID().equals("mail")) {
								//System.out.println(attr.get(0).toString());
								userName = attr.get(0).toString();
							}
						}
					} catch (NamingException e) {
						System.err.println("Défaut : " + e);
						e.printStackTrace();
					}
				}
			}
			ctx.close();
		} catch (NamingException e) {
			System.err.println("Problème de connexion");
			e.printStackTrace();
		}
		for (Iterator<Student> i = users.iterator(); i.hasNext();) {
			User item = i.next();
			System.out.println(item.getFirstName() + " " + item.getLastName()+ " " + item.getUserName());
		}

		System.out.println(users.size());

	}
}