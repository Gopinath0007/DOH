// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audittrail.proxies;

public class LogLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject logLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AuditTrail.LogLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MemberType("MemberType"),
		Member("Member"),
		OldValue("OldValue"),
		NewValue("NewValue"),
		Diff("Diff"),
		CalculatedOldValue("CalculatedOldValue"),
		CalculatedNewValue("CalculatedNewValue"),
		Hide_old("Hide_old"),
		Hide2("Hide2"),
		LogLine_Log("AuditTrail.LogLine_Log");

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

	public LogLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AuditTrail.LogLine"));
	}

	protected LogLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject logLineMendixObject)
	{
		if (logLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AuditTrail.LogLine", logLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AuditTrail.LogLine");

		this.logLineMendixObject = logLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'LogLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static audittrail.proxies.LogLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audittrail.proxies.LogLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audittrail.proxies.LogLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audittrail.proxies.LogLine(context, mendixObject);
	}

	public static audittrail.proxies.LogLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audittrail.proxies.LogLine.initialize(context, mendixObject);
	}

	public static java.util.List<audittrail.proxies.LogLine> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<audittrail.proxies.LogLine> result = new java.util.ArrayList<audittrail.proxies.LogLine>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AuditTrail.LogLine" + xpathConstraint))
			result.add(audittrail.proxies.LogLine.initialize(context, obj));
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
	 * Set value of MemberType
	 * @param membertype
	 */
	public final audittrail.proxies.MemberType getMemberType()
	{
		return getMemberType(getContext());
	}

	/**
	 * @param context
	 * @return value of MemberType
	 */
	public final audittrail.proxies.MemberType getMemberType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.MemberType.toString());
		if (obj == null)
			return null;

		return audittrail.proxies.MemberType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of MemberType
	 * @param membertype
	 */
	public final void setMemberType(audittrail.proxies.MemberType membertype)
	{
		setMemberType(getContext(), membertype);
	}

	/**
	 * Set value of MemberType
	 * @param context
	 * @param membertype
	 */
	public final void setMemberType(com.mendix.systemwideinterfaces.core.IContext context, audittrail.proxies.MemberType membertype)
	{
		if (membertype != null)
			getMendixObject().setValue(context, MemberNames.MemberType.toString(), membertype.toString());
		else
			getMendixObject().setValue(context, MemberNames.MemberType.toString(), null);
	}

	/**
	 * @return value of Member
	 */
	public final java.lang.String getMember()
	{
		return getMember(getContext());
	}

	/**
	 * @param context
	 * @return value of Member
	 */
	public final java.lang.String getMember(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Member.toString());
	}

	/**
	 * Set value of Member
	 * @param member
	 */
	public final void setMember(java.lang.String member)
	{
		setMember(getContext(), member);
	}

	/**
	 * Set value of Member
	 * @param context
	 * @param member
	 */
	public final void setMember(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String member)
	{
		getMendixObject().setValue(context, MemberNames.Member.toString(), member);
	}

	/**
	 * @return value of OldValue
	 */
	public final java.lang.String getOldValue()
	{
		return getOldValue(getContext());
	}

	/**
	 * @param context
	 * @return value of OldValue
	 */
	public final java.lang.String getOldValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OldValue.toString());
	}

	/**
	 * Set value of OldValue
	 * @param oldvalue
	 */
	public final void setOldValue(java.lang.String oldvalue)
	{
		setOldValue(getContext(), oldvalue);
	}

	/**
	 * Set value of OldValue
	 * @param context
	 * @param oldvalue
	 */
	public final void setOldValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String oldvalue)
	{
		getMendixObject().setValue(context, MemberNames.OldValue.toString(), oldvalue);
	}

	/**
	 * @return value of NewValue
	 */
	public final java.lang.String getNewValue()
	{
		return getNewValue(getContext());
	}

	/**
	 * @param context
	 * @return value of NewValue
	 */
	public final java.lang.String getNewValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NewValue.toString());
	}

	/**
	 * Set value of NewValue
	 * @param newvalue
	 */
	public final void setNewValue(java.lang.String newvalue)
	{
		setNewValue(getContext(), newvalue);
	}

	/**
	 * Set value of NewValue
	 * @param context
	 * @param newvalue
	 */
	public final void setNewValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String newvalue)
	{
		getMendixObject().setValue(context, MemberNames.NewValue.toString(), newvalue);
	}

	/**
	 * @return value of Diff
	 */
	public final java.lang.String getDiff()
	{
		return getDiff(getContext());
	}

	/**
	 * @param context
	 * @return value of Diff
	 */
	public final java.lang.String getDiff(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Diff.toString());
	}

	/**
	 * Set value of Diff
	 * @param diff
	 */
	public final void setDiff(java.lang.String diff)
	{
		setDiff(getContext(), diff);
	}

	/**
	 * Set value of Diff
	 * @param context
	 * @param diff
	 */
	public final void setDiff(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String diff)
	{
		getMendixObject().setValue(context, MemberNames.Diff.toString(), diff);
	}

	/**
	 * @return value of CalculatedOldValue
	 */
	public final java.lang.String getCalculatedOldValue()
	{
		return getCalculatedOldValue(getContext());
	}

	/**
	 * @param context
	 * @return value of CalculatedOldValue
	 */
	public final java.lang.String getCalculatedOldValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CalculatedOldValue.toString());
	}

	/**
	 * Set value of CalculatedOldValue
	 * @param calculatedoldvalue
	 */
	public final void setCalculatedOldValue(java.lang.String calculatedoldvalue)
	{
		setCalculatedOldValue(getContext(), calculatedoldvalue);
	}

	/**
	 * Set value of CalculatedOldValue
	 * @param context
	 * @param calculatedoldvalue
	 */
	public final void setCalculatedOldValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String calculatedoldvalue)
	{
		getMendixObject().setValue(context, MemberNames.CalculatedOldValue.toString(), calculatedoldvalue);
	}

	/**
	 * @return value of CalculatedNewValue
	 */
	public final java.lang.String getCalculatedNewValue()
	{
		return getCalculatedNewValue(getContext());
	}

	/**
	 * @param context
	 * @return value of CalculatedNewValue
	 */
	public final java.lang.String getCalculatedNewValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.CalculatedNewValue.toString());
	}

	/**
	 * Set value of CalculatedNewValue
	 * @param calculatednewvalue
	 */
	public final void setCalculatedNewValue(java.lang.String calculatednewvalue)
	{
		setCalculatedNewValue(getContext(), calculatednewvalue);
	}

	/**
	 * Set value of CalculatedNewValue
	 * @param context
	 * @param calculatednewvalue
	 */
	public final void setCalculatedNewValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String calculatednewvalue)
	{
		getMendixObject().setValue(context, MemberNames.CalculatedNewValue.toString(), calculatednewvalue);
	}

	/**
	 * @return value of Hide_old
	 */
	public final java.lang.String getHide_old()
	{
		return getHide_old(getContext());
	}

	/**
	 * @param context
	 * @return value of Hide_old
	 */
	public final java.lang.String getHide_old(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Hide_old.toString());
	}

	/**
	 * Set value of Hide_old
	 * @param hide_old
	 */
	public final void setHide_old(java.lang.String hide_old)
	{
		setHide_old(getContext(), hide_old);
	}

	/**
	 * Set value of Hide_old
	 * @param context
	 * @param hide_old
	 */
	public final void setHide_old(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hide_old)
	{
		getMendixObject().setValue(context, MemberNames.Hide_old.toString(), hide_old);
	}

	/**
	 * @return value of Hide2
	 */
	public final java.lang.String getHide2()
	{
		return getHide2(getContext());
	}

	/**
	 * @param context
	 * @return value of Hide2
	 */
	public final java.lang.String getHide2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Hide2.toString());
	}

	/**
	 * Set value of Hide2
	 * @param hide2
	 */
	public final void setHide2(java.lang.String hide2)
	{
		setHide2(getContext(), hide2);
	}

	/**
	 * Set value of Hide2
	 * @param context
	 * @param hide2
	 */
	public final void setHide2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String hide2)
	{
		getMendixObject().setValue(context, MemberNames.Hide2.toString(), hide2);
	}

	/**
	 * @return value of LogLine_Log
	 */
	public final audittrail.proxies.Log getLogLine_Log() throws com.mendix.core.CoreException
	{
		return getLogLine_Log(getContext());
	}

	/**
	 * @param context
	 * @return value of LogLine_Log
	 */
	public final audittrail.proxies.Log getLogLine_Log(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audittrail.proxies.Log result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.LogLine_Log.toString());
		if (identifier != null)
			result = audittrail.proxies.Log.load(context, identifier);
		return result;
	}

	/**
	 * Set value of LogLine_Log
	 * @param logline_log
	 */
	public final void setLogLine_Log(audittrail.proxies.Log logline_log)
	{
		setLogLine_Log(getContext(), logline_log);
	}

	/**
	 * Set value of LogLine_Log
	 * @param context
	 * @param logline_log
	 */
	public final void setLogLine_Log(com.mendix.systemwideinterfaces.core.IContext context, audittrail.proxies.Log logline_log)
	{
		if (logline_log == null)
			getMendixObject().setValue(context, MemberNames.LogLine_Log.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.LogLine_Log.toString(), logline_log.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return logLineMendixObject;
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
			final audittrail.proxies.LogLine that = (audittrail.proxies.LogLine) obj;
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
		return "AuditTrail.LogLine";
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