// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Sibilings
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject sibilingsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Sibilings";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		SibilingNameArabic("SibilingNameArabic"),
		SibilingNameEnglish("SibilingNameEnglish"),
		DateOfBirth("DateOfBirth"),
		Gender("Gender"),
		Sibilings_BirthNotification("MyFirstModule.Sibilings_BirthNotification");

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

	public Sibilings(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Sibilings"));
	}

	protected Sibilings(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject sibilingsMendixObject)
	{
		if (sibilingsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Sibilings", sibilingsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Sibilings");

		this.sibilingsMendixObject = sibilingsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Sibilings.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.Sibilings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Sibilings.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Sibilings initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Sibilings(context, mendixObject);
	}

	public static myfirstmodule.proxies.Sibilings load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Sibilings.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Sibilings> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Sibilings> result = new java.util.ArrayList<myfirstmodule.proxies.Sibilings>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Sibilings" + xpathConstraint))
			result.add(myfirstmodule.proxies.Sibilings.initialize(context, obj));
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
	 * @return value of SibilingNameArabic
	 */
	public final java.lang.String getSibilingNameArabic()
	{
		return getSibilingNameArabic(getContext());
	}

	/**
	 * @param context
	 * @return value of SibilingNameArabic
	 */
	public final java.lang.String getSibilingNameArabic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SibilingNameArabic.toString());
	}

	/**
	 * Set value of SibilingNameArabic
	 * @param sibilingnamearabic
	 */
	public final void setSibilingNameArabic(java.lang.String sibilingnamearabic)
	{
		setSibilingNameArabic(getContext(), sibilingnamearabic);
	}

	/**
	 * Set value of SibilingNameArabic
	 * @param context
	 * @param sibilingnamearabic
	 */
	public final void setSibilingNameArabic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sibilingnamearabic)
	{
		getMendixObject().setValue(context, MemberNames.SibilingNameArabic.toString(), sibilingnamearabic);
	}

	/**
	 * @return value of SibilingNameEnglish
	 */
	public final java.lang.String getSibilingNameEnglish()
	{
		return getSibilingNameEnglish(getContext());
	}

	/**
	 * @param context
	 * @return value of SibilingNameEnglish
	 */
	public final java.lang.String getSibilingNameEnglish(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.SibilingNameEnglish.toString());
	}

	/**
	 * Set value of SibilingNameEnglish
	 * @param sibilingnameenglish
	 */
	public final void setSibilingNameEnglish(java.lang.String sibilingnameenglish)
	{
		setSibilingNameEnglish(getContext(), sibilingnameenglish);
	}

	/**
	 * Set value of SibilingNameEnglish
	 * @param context
	 * @param sibilingnameenglish
	 */
	public final void setSibilingNameEnglish(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String sibilingnameenglish)
	{
		getMendixObject().setValue(context, MemberNames.SibilingNameEnglish.toString(), sibilingnameenglish);
	}

	/**
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth()
	{
		return getDateOfBirth(getContext());
	}

	/**
	 * @param context
	 * @return value of DateOfBirth
	 */
	public final java.util.Date getDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateOfBirth.toString());
	}

	/**
	 * Set value of DateOfBirth
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(java.util.Date dateofbirth)
	{
		setDateOfBirth(getContext(), dateofbirth);
	}

	/**
	 * Set value of DateOfBirth
	 * @param context
	 * @param dateofbirth
	 */
	public final void setDateOfBirth(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateofbirth)
	{
		getMendixObject().setValue(context, MemberNames.DateOfBirth.toString(), dateofbirth);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final myfirstmodule.proxies.EnumGender getGender()
	{
		return getGender(getContext());
	}

	/**
	 * @param context
	 * @return value of Gender
	 */
	public final myfirstmodule.proxies.EnumGender getGender(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Gender.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.EnumGender.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Gender
	 * @param gender
	 */
	public final void setGender(myfirstmodule.proxies.EnumGender gender)
	{
		setGender(getContext(), gender);
	}

	/**
	 * Set value of Gender
	 * @param context
	 * @param gender
	 */
	public final void setGender(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.EnumGender gender)
	{
		if (gender != null)
			getMendixObject().setValue(context, MemberNames.Gender.toString(), gender.toString());
		else
			getMendixObject().setValue(context, MemberNames.Gender.toString(), null);
	}

	/**
	 * @return value of Sibilings_BirthNotification
	 */
	public final myfirstmodule.proxies.BirthNotification getSibilings_BirthNotification() throws com.mendix.core.CoreException
	{
		return getSibilings_BirthNotification(getContext());
	}

	/**
	 * @param context
	 * @return value of Sibilings_BirthNotification
	 */
	public final myfirstmodule.proxies.BirthNotification getSibilings_BirthNotification(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.BirthNotification result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Sibilings_BirthNotification.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.BirthNotification.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Sibilings_BirthNotification
	 * @param sibilings_birthnotification
	 */
	public final void setSibilings_BirthNotification(myfirstmodule.proxies.BirthNotification sibilings_birthnotification)
	{
		setSibilings_BirthNotification(getContext(), sibilings_birthnotification);
	}

	/**
	 * Set value of Sibilings_BirthNotification
	 * @param context
	 * @param sibilings_birthnotification
	 */
	public final void setSibilings_BirthNotification(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.BirthNotification sibilings_birthnotification)
	{
		if (sibilings_birthnotification == null)
			getMendixObject().setValue(context, MemberNames.Sibilings_BirthNotification.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Sibilings_BirthNotification.toString(), sibilings_birthnotification.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return sibilingsMendixObject;
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
			final myfirstmodule.proxies.Sibilings that = (myfirstmodule.proxies.Sibilings) obj;
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
		return "MyFirstModule.Sibilings";
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
