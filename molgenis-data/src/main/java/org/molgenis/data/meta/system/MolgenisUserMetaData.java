package org.molgenis.data.meta.system;

import org.molgenis.data.support.DefaultEntityMetaData;
import org.springframework.jdbc.datasource.AbstractDriverBasedDataSource;

public class MolgenisUserMetaData extends DefaultEntityMetaData {
    public static final String ID = "id";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password_";
    public static final String ACTIVATIONCODE= "activationCode";
    public static final String ACTIVE = "active";
    public static final String SUPERUSER = "superuser";
    public static final String FIRSTNAME = "FirstName";
    public static final String MIDDLENAMES = "MiddleNames";
    public static final String LASTNAME = "LastName";
    public static final String TITLE = "Title";
    public static final String AFFILIATIONS = "Affiliation";
    public static final String DEPARTMENT = "Department";
    public static final String ROLE = "Role";
    public static final String ADDRESS = "Address";
    public static final String PHONE= "Phone";
    public static final String EMAIL = "Email";
    public static final String FAX = "Fax";
    public static final String TOLLFREEPHONE = "tollFreePhone";
    public static final String CITY = "City";
    public static final String COUNTRY = "Country";
    public static final String CHANGEPASSWORD = "changePassword";
    public static final String LANGUAGECODE= "languageCode";
    public static final String GOOGLEACCOUNTID = "googleAccountId";

    public MolgenisUserMetaData() {
        super("molgenisUser");
        addAttribute(ID).setAuto(true).setVisible(false)
                .setDescription("automatically generated internal id, only for internal use.");
        addAttribute(USERNAME);
        addAttribute(PASSWORD);
        addAttribute(ACTIVATIONCODE);
        addAttribute(ACTIVE);
        addAttribute(SUPERUSER);
        addAttribute(FIRSTNAME);
        addAttribute(MIDDLENAMES);
        addAttribute(LASTNAME);
        addAttribute(TITLE);
        addAttribute(AFFILIATIONS);
        addAttribute(DEPARTMENT);
        addAttribute(ROLE);
        addAttribute(ADDRESS);
        addAttribute(PHONE);
        addAttribute(FAX);
        addAttribute(TOLLFREEPHONE);
        addAttribute(CITY);
        addAttribute(COUNTRY);
        addAttribute(CHANGEPASSWORD);
        addAttribute(LANGUAGECODE);
        addAttribute(GOOGLEACCOUNTID);
    }

    /*<?xml version="1.0" encoding="UTF-8"?>
    <molgenis name="org.molgenis">
    <module name="auth">
    <entity name="MolgenisUser" system="true" xref_lookup="username,Email,LastName" decorator="org.molgenis.security.user.MolgenisUserDecorator">
    <description>Anyone who can login</description>
    <field name="id" type="autoid" hidden="true" description="automatically generated internal id, only for internal use."/>
    <field name="username" label="Username" type="string"/>
    <field name="password_" label="Password" type="string" description="This is the hashed password, enter a new plaintext password to update."/>
    <field name="activationCode" label="Activation code" type="string" nillable="true" description="Used as alternative authentication mechanism to verify user email and/or if user has lost password."/>
    <field name="active" label="Active" type="bool" default="false" description="Boolean to indicate if this account can be used to login"/>
    <field name="superuser" label="Superuser" type="bool" default="false"/>
    <field name="FirstName" label="First name" nillable="true"/>
    <field name="MiddleNames" label="Middle names" nillable="true"/>
    <field name="LastName" label="Last name" nillable="true"/>
    <field name="Title" label="Title" nillable="true" description="An academic title, e.g. Prof.dr, PhD"/>
    <field name="Affiliation" type="string" nillable="true"/>
    <field name="Department" type="string" nillable="true" description="Added from the old definition of MolgenisUser. Department of this contact."/>
    <field name="Role" type="string" nillable="true" description="Indicate role of the contact, e.g. lab worker or PI."/>
    <field name="Address" type="text" nillable="true" description="The address of the Contact."/>
    <field name="Phone" nillable="true" description="The telephone number of the Contact including the suitable area codes."/>
    <field name="Email" type="email" description="The email address of the Contact."/>
    <field name="Fax" nillable="true" type="varchar" description="The fax number of the Contact."/>
    <field name="tollFreePhone" label="Toll-free phone" nillable="true" type="string" description="A toll free phone number for the Contact, including suitable area codes."/>
    <field name="City" type="string" nillable="true" description="Added from the old definition of MolgenisUser. City of this contact."/>
    <field name="Country" type="string" nillable="true" description="Added from the old definition of MolgenisUser. Country of this contact."/>
    <field name="changePassword" label="Change password" type="boolean" default="false" description="If true the user must first change his password before he can proceed" />
    <field name="languageCode" label="Language code" nillable="true" description="Selected language for this site." />
    <field name="googleAccountId" label="Google account ID" type="string" nillable="true" description="An identifier for the user, unique among all Google accounts and never reused." />
    <unique fields="username"/>
    <unique fields="Email"/>  */
}
