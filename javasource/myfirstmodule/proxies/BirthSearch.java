// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class BirthSearch
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject birthSearchMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.BirthSearch";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NotificationNumber("NotificationNumber"),
		IsSearch("IsSearch"),
		NotificationType("NotificationType"),
		Status("Status");

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

	public BirthSearch(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.BirthSearch"));
	}

	protected BirthSearch(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject birthSearchMendixObject)
	{
		if (birthSearchMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.BirthSearch", birthSearchMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.BirthSearch");

		this.birthSearchMendixObject = birthSearchMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BirthSearch.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static myfirstmodule.proxies.BirthSearch initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.BirthSearch.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.BirthSearch initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.BirthSearch(context, mendixObject);
	}

	public static myfirstmodule.proxies.BirthSearch load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.BirthSearch.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.BirthSearch> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.BirthSearch> result = new java.util.ArrayList<myfirstmodule.proxies.BirthSearch>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.BirthSearch" + xpathConstraint))
			result.add(myfirstmodule.proxies.BirthSearch.initialize(context, obj));
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
	 * @return value of NotificationNumber
	 */
	public final java.lang.String getNotificationNumber()
	{
		return getNotificationNumber(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationNumber
	 */
	public final java.lang.String getNotificationNumber(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NotificationNumber.toString());
	}

	/**
	 * Set value of NotificationNumber
	 * @param notificationnumber
	 */
	public final void setNotificationNumber(java.lang.String notificationnumber)
	{
		setNotificationNumber(getContext(), notificationnumber);
	}

	/**
	 * Set value of NotificationNumber
	 * @param context
	 * @param notificationnumber
	 */
	public final void setNotificationNumber(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notificationnumber)
	{
		getMendixObject().setValue(context, MemberNames.NotificationNumber.toString(), notificationnumber);
	}

	/**
	 * @return value of IsSearch
	 */
	public final java.lang.Boolean getIsSearch()
	{
		return getIsSearch(getContext());
	}

	/**
	 * @param context
	 * @return value of IsSearch
	 */
	public final java.lang.Boolean getIsSearch(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.IsSearch.toString());
	}

	/**
	 * Set value of IsSearch
	 * @param issearch
	 */
	public final void setIsSearch(java.lang.Boolean issearch)
	{
		setIsSearch(getContext(), issearch);
	}

	/**
	 * Set value of IsSearch
	 * @param context
	 * @param issearch
	 */
	public final void setIsSearch(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean issearch)
	{
		getMendixObject().setValue(context, MemberNames.IsSearch.toString(), issearch);
	}

	/**
	 * @return value of NotificationType
	 */
	public final java.lang.String getNotificationType()
	{
		return getNotificationType(getContext());
	}

	/**
	 * @param context
	 * @return value of NotificationType
	 */
	public final java.lang.String getNotificationType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NotificationType.toString());
	}

	/**
	 * Set value of NotificationType
	 * @param notificationtype
	 */
	public final void setNotificationType(java.lang.String notificationtype)
	{
		setNotificationType(getContext(), notificationtype);
	}

	/**
	 * Set value of NotificationType
	 * @param context
	 * @param notificationtype
	 */
	public final void setNotificationType(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String notificationtype)
	{
		getMendixObject().setValue(context, MemberNames.NotificationType.toString(), notificationtype);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final myfirstmodule.proxies.EnumStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final myfirstmodule.proxies.EnumStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.EnumStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(myfirstmodule.proxies.EnumStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.EnumStatus status)
	{
		if (status != null)
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		else
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return birthSearchMendixObject;
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
			final myfirstmodule.proxies.BirthSearch that = (myfirstmodule.proxies.BirthSearch) obj;
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
		return "MyFirstModule.BirthSearch";
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
