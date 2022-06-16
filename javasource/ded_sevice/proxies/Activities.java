// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package ded_sevice.proxies;

public class Activities
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject activitiesMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "DED_sevice.Activities";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ActivityCode("ActivityCode"),
		AcivityDescEN("AcivityDescEN"),
		ActivityDescAr("ActivityDescAr");

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

	public Activities(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "DED_sevice.Activities"));
	}

	protected Activities(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject activitiesMendixObject)
	{
		if (activitiesMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("DED_sevice.Activities", activitiesMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a DED_sevice.Activities");

		this.activitiesMendixObject = activitiesMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Activities.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static ded_sevice.proxies.Activities initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return ded_sevice.proxies.Activities.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static ded_sevice.proxies.Activities initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new ded_sevice.proxies.Activities(context, mendixObject);
	}

	public static ded_sevice.proxies.Activities load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return ded_sevice.proxies.Activities.initialize(context, mendixObject);
	}

	public static java.util.List<ded_sevice.proxies.Activities> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<ded_sevice.proxies.Activities> result = new java.util.ArrayList<ded_sevice.proxies.Activities>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//DED_sevice.Activities" + xpathConstraint))
			result.add(ded_sevice.proxies.Activities.initialize(context, obj));
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
	 * @return value of ActivityCode
	 */
	public final java.lang.String getActivityCode()
	{
		return getActivityCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ActivityCode
	 */
	public final java.lang.String getActivityCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ActivityCode.toString());
	}

	/**
	 * Set value of ActivityCode
	 * @param activitycode
	 */
	public final void setActivityCode(java.lang.String activitycode)
	{
		setActivityCode(getContext(), activitycode);
	}

	/**
	 * Set value of ActivityCode
	 * @param context
	 * @param activitycode
	 */
	public final void setActivityCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String activitycode)
	{
		getMendixObject().setValue(context, MemberNames.ActivityCode.toString(), activitycode);
	}

	/**
	 * @return value of AcivityDescEN
	 */
	public final java.lang.String getAcivityDescEN()
	{
		return getAcivityDescEN(getContext());
	}

	/**
	 * @param context
	 * @return value of AcivityDescEN
	 */
	public final java.lang.String getAcivityDescEN(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AcivityDescEN.toString());
	}

	/**
	 * Set value of AcivityDescEN
	 * @param acivitydescen
	 */
	public final void setAcivityDescEN(java.lang.String acivitydescen)
	{
		setAcivityDescEN(getContext(), acivitydescen);
	}

	/**
	 * Set value of AcivityDescEN
	 * @param context
	 * @param acivitydescen
	 */
	public final void setAcivityDescEN(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String acivitydescen)
	{
		getMendixObject().setValue(context, MemberNames.AcivityDescEN.toString(), acivitydescen);
	}

	/**
	 * @return value of ActivityDescAr
	 */
	public final java.lang.String getActivityDescAr()
	{
		return getActivityDescAr(getContext());
	}

	/**
	 * @param context
	 * @return value of ActivityDescAr
	 */
	public final java.lang.String getActivityDescAr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ActivityDescAr.toString());
	}

	/**
	 * Set value of ActivityDescAr
	 * @param activitydescar
	 */
	public final void setActivityDescAr(java.lang.String activitydescar)
	{
		setActivityDescAr(getContext(), activitydescar);
	}

	/**
	 * Set value of ActivityDescAr
	 * @param context
	 * @param activitydescar
	 */
	public final void setActivityDescAr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String activitydescar)
	{
		getMendixObject().setValue(context, MemberNames.ActivityDescAr.toString(), activitydescar);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return activitiesMendixObject;
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
			final ded_sevice.proxies.Activities that = (ded_sevice.proxies.Activities) obj;
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
		return "DED_sevice.Activities";
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
