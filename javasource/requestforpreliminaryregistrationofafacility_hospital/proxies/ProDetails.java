// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package requestforpreliminaryregistrationofafacility_hospital.proxies;

public class ProDetails
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject proDetailsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		FirstName_En("FirstName_En"),
		MiddleName_En("MiddleName_En"),
		LastName_En("LastName_En"),
		FirstName_Ar("FirstName_Ar"),
		MiddleName_Ar("MiddleName_Ar"),
		LastName_Ar("LastName_Ar"),
		EmiratesID("EmiratesID"),
		EmailAddress("EmailAddress"),
		MobileNumber("MobileNumber"),
		ProDetails_Preliminary("RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails_Preliminary");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public ProDetails(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails"));
	}

	protected ProDetails(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject proDetailsMendixObject)
	{
		if (proDetailsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails", proDetailsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails");

		this.proDetailsMendixObject = proDetailsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ProDetails.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails(context, mendixObject);
	}

	public static requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails.initialize(context, mendixObject);
	}

	public static java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails> result = new java.util.ArrayList<requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails" + xpathConstraint))
			result.add(requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * Set value of Title
	 * @param title
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.ENUM_Title getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.ENUM_Title getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Title.toString());
		if (obj == null)
			return null;

		return requestforpreliminaryregistrationofafacility_hospital.proxies.ENUM_Title.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(requestforpreliminaryregistrationofafacility_hospital.proxies.ENUM_Title title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, requestforpreliminaryregistrationofafacility_hospital.proxies.ENUM_Title title)
	{
		if (title != null)
			getMendixObject().setValue(context, MemberNames.Title.toString(), title.toString());
		else
			getMendixObject().setValue(context, MemberNames.Title.toString(), null);
	}

	/**
	 * @return value of FirstName_En
	 */
	public final java.lang.String getFirstName_En()
	{
		return getFirstName_En(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName_En
	 */
	public final java.lang.String getFirstName_En(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName_En.toString());
	}

	/**
	 * Set value of FirstName_En
	 * @param firstname_en
	 */
	public final void setFirstName_En(java.lang.String firstname_en)
	{
		setFirstName_En(getContext(), firstname_en);
	}

	/**
	 * Set value of FirstName_En
	 * @param context
	 * @param firstname_en
	 */
	public final void setFirstName_En(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname_en)
	{
		getMendixObject().setValue(context, MemberNames.FirstName_En.toString(), firstname_en);
	}

	/**
	 * @return value of MiddleName_En
	 */
	public final java.lang.String getMiddleName_En()
	{
		return getMiddleName_En(getContext());
	}

	/**
	 * @param context
	 * @return value of MiddleName_En
	 */
	public final java.lang.String getMiddleName_En(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MiddleName_En.toString());
	}

	/**
	 * Set value of MiddleName_En
	 * @param middlename_en
	 */
	public final void setMiddleName_En(java.lang.String middlename_en)
	{
		setMiddleName_En(getContext(), middlename_en);
	}

	/**
	 * Set value of MiddleName_En
	 * @param context
	 * @param middlename_en
	 */
	public final void setMiddleName_En(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String middlename_en)
	{
		getMendixObject().setValue(context, MemberNames.MiddleName_En.toString(), middlename_en);
	}

	/**
	 * @return value of LastName_En
	 */
	public final java.lang.String getLastName_En()
	{
		return getLastName_En(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName_En
	 */
	public final java.lang.String getLastName_En(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName_En.toString());
	}

	/**
	 * Set value of LastName_En
	 * @param lastname_en
	 */
	public final void setLastName_En(java.lang.String lastname_en)
	{
		setLastName_En(getContext(), lastname_en);
	}

	/**
	 * Set value of LastName_En
	 * @param context
	 * @param lastname_en
	 */
	public final void setLastName_En(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname_en)
	{
		getMendixObject().setValue(context, MemberNames.LastName_En.toString(), lastname_en);
	}

	/**
	 * @return value of FirstName_Ar
	 */
	public final java.lang.String getFirstName_Ar()
	{
		return getFirstName_Ar(getContext());
	}

	/**
	 * @param context
	 * @return value of FirstName_Ar
	 */
	public final java.lang.String getFirstName_Ar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.FirstName_Ar.toString());
	}

	/**
	 * Set value of FirstName_Ar
	 * @param firstname_ar
	 */
	public final void setFirstName_Ar(java.lang.String firstname_ar)
	{
		setFirstName_Ar(getContext(), firstname_ar);
	}

	/**
	 * Set value of FirstName_Ar
	 * @param context
	 * @param firstname_ar
	 */
	public final void setFirstName_Ar(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String firstname_ar)
	{
		getMendixObject().setValue(context, MemberNames.FirstName_Ar.toString(), firstname_ar);
	}

	/**
	 * @return value of MiddleName_Ar
	 */
	public final java.lang.String getMiddleName_Ar()
	{
		return getMiddleName_Ar(getContext());
	}

	/**
	 * @param context
	 * @return value of MiddleName_Ar
	 */
	public final java.lang.String getMiddleName_Ar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MiddleName_Ar.toString());
	}

	/**
	 * Set value of MiddleName_Ar
	 * @param middlename_ar
	 */
	public final void setMiddleName_Ar(java.lang.String middlename_ar)
	{
		setMiddleName_Ar(getContext(), middlename_ar);
	}

	/**
	 * Set value of MiddleName_Ar
	 * @param context
	 * @param middlename_ar
	 */
	public final void setMiddleName_Ar(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String middlename_ar)
	{
		getMendixObject().setValue(context, MemberNames.MiddleName_Ar.toString(), middlename_ar);
	}

	/**
	 * @return value of LastName_Ar
	 */
	public final java.lang.String getLastName_Ar()
	{
		return getLastName_Ar(getContext());
	}

	/**
	 * @param context
	 * @return value of LastName_Ar
	 */
	public final java.lang.String getLastName_Ar(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.LastName_Ar.toString());
	}

	/**
	 * Set value of LastName_Ar
	 * @param lastname_ar
	 */
	public final void setLastName_Ar(java.lang.String lastname_ar)
	{
		setLastName_Ar(getContext(), lastname_ar);
	}

	/**
	 * Set value of LastName_Ar
	 * @param context
	 * @param lastname_ar
	 */
	public final void setLastName_Ar(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String lastname_ar)
	{
		getMendixObject().setValue(context, MemberNames.LastName_Ar.toString(), lastname_ar);
	}

	/**
	 * @return value of EmiratesID
	 */
	public final java.lang.Long getEmiratesID()
	{
		return getEmiratesID(getContext());
	}

	/**
	 * @param context
	 * @return value of EmiratesID
	 */
	public final java.lang.Long getEmiratesID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.EmiratesID.toString());
	}

	/**
	 * Set value of EmiratesID
	 * @param emiratesid
	 */
	public final void setEmiratesID(java.lang.Long emiratesid)
	{
		setEmiratesID(getContext(), emiratesid);
	}

	/**
	 * Set value of EmiratesID
	 * @param context
	 * @param emiratesid
	 */
	public final void setEmiratesID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long emiratesid)
	{
		getMendixObject().setValue(context, MemberNames.EmiratesID.toString(), emiratesid);
	}

	/**
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress()
	{
		return getEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmailAddress.toString());
	}

	/**
	 * Set value of EmailAddress
	 * @param emailaddress
	 */
	public final void setEmailAddress(java.lang.String emailaddress)
	{
		setEmailAddress(getContext(), emailaddress);
	}

	/**
	 * Set value of EmailAddress
	 * @param context
	 * @param emailaddress
	 */
	public final void setEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emailaddress)
	{
		getMendixObject().setValue(context, MemberNames.EmailAddress.toString(), emailaddress);
	}

	/**
	 * @return value of MobileNumber
	 */
	public final java.lang.Long getMobileNumber()
	{
		return getMobileNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of MobileNumber
	 */
	public final java.lang.Long getMobileNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.MobileNumber.toString());
	}

	/**
	 * Set value of MobileNumber
	 * @param mobilenumber
	 */
	public final void setMobileNumber(java.lang.Long mobilenumber)
	{
		setMobileNumber(getContext(), mobilenumber);
	}

	/**
	 * Set value of MobileNumber
	 * @param context
	 * @param mobilenumber
	 */
	public final void setMobileNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long mobilenumber)
	{
		getMendixObject().setValue(context, MemberNames.MobileNumber.toString(), mobilenumber);
	}

	/**
	 * @return value of ProDetails_Preliminary
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary getProDetails_Preliminary() throws com.mendix.core.CoreException
	{
		return getProDetails_Preliminary(getContext());
	}

	/**
	 * @param context
	 * @return value of ProDetails_Preliminary
	 */
	public final requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary getProDetails_Preliminary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ProDetails_Preliminary.toString());
		if (identifier != null)
			result = requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ProDetails_Preliminary
	 * @param prodetails_preliminary
	 */
	public final void setProDetails_Preliminary(requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary prodetails_preliminary)
	{
		setProDetails_Preliminary(getContext(), prodetails_preliminary);
	}

	/**
	 * Set value of ProDetails_Preliminary
	 * @param context
	 * @param prodetails_preliminary
	 */
	public final void setProDetails_Preliminary(com.mendix.systemwideinterfaces.core.IContext context, requestforpreliminaryregistrationofafacility_hospital.proxies.Preliminary prodetails_preliminary)
	{
		if (prodetails_preliminary == null)
			getMendixObject().setValue(context, MemberNames.ProDetails_Preliminary.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ProDetails_Preliminary.toString(), prodetails_preliminary.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return proDetailsMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails that = (requestforpreliminaryregistrationofafacility_hospital.proxies.ProDetails) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "RequestforPreliminaryRegistrationofaFacility_Hospital.ProDetails";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
