// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package audittrail.proxies;

public class ReferenceLogLine
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject referenceLogLineMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AuditTrail.ReferenceLogLine";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Member("Member"),
		Value("Value"),
		ReferenceLogLine_ReferenceLog("AuditTrail.ReferenceLogLine_ReferenceLog");

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

	public ReferenceLogLine(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AuditTrail.ReferenceLogLine"));
	}

	protected ReferenceLogLine(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject referenceLogLineMendixObject)
	{
		if (referenceLogLineMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AuditTrail.ReferenceLogLine", referenceLogLineMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AuditTrail.ReferenceLogLine");

		this.referenceLogLineMendixObject = referenceLogLineMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'ReferenceLogLine.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static audittrail.proxies.ReferenceLogLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return audittrail.proxies.ReferenceLogLine.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static audittrail.proxies.ReferenceLogLine initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new audittrail.proxies.ReferenceLogLine(context, mendixObject);
	}

	public static audittrail.proxies.ReferenceLogLine load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return audittrail.proxies.ReferenceLogLine.initialize(context, mendixObject);
	}

	public static java.util.List<audittrail.proxies.ReferenceLogLine> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<audittrail.proxies.ReferenceLogLine> result = new java.util.ArrayList<audittrail.proxies.ReferenceLogLine>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//AuditTrail.ReferenceLogLine" + xpathConstraint))
			result.add(audittrail.proxies.ReferenceLogLine.initialize(context, obj));
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
	 * @return value of Value
	 */
	public final java.lang.String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.String getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of ReferenceLogLine_ReferenceLog
	 */
	public final audittrail.proxies.ReferenceLog getReferenceLogLine_ReferenceLog() throws com.mendix.core.CoreException
	{
		return getReferenceLogLine_ReferenceLog(getContext());
	}

	/**
	 * @param context
	 * @return value of ReferenceLogLine_ReferenceLog
	 */
	public final audittrail.proxies.ReferenceLog getReferenceLogLine_ReferenceLog(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		audittrail.proxies.ReferenceLog result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.ReferenceLogLine_ReferenceLog.toString());
		if (identifier != null)
			result = audittrail.proxies.ReferenceLog.load(context, identifier);
		return result;
	}

	/**
	 * Set value of ReferenceLogLine_ReferenceLog
	 * @param referencelogline_referencelog
	 */
	public final void setReferenceLogLine_ReferenceLog(audittrail.proxies.ReferenceLog referencelogline_referencelog)
	{
		setReferenceLogLine_ReferenceLog(getContext(), referencelogline_referencelog);
	}

	/**
	 * Set value of ReferenceLogLine_ReferenceLog
	 * @param context
	 * @param referencelogline_referencelog
	 */
	public final void setReferenceLogLine_ReferenceLog(com.mendix.systemwideinterfaces.core.IContext context, audittrail.proxies.ReferenceLog referencelogline_referencelog)
	{
		if (referencelogline_referencelog == null)
			getMendixObject().setValue(context, MemberNames.ReferenceLogLine_ReferenceLog.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.ReferenceLogLine_ReferenceLog.toString(), referencelogline_referencelog.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return referenceLogLineMendixObject;
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
			final audittrail.proxies.ReferenceLogLine that = (audittrail.proxies.ReferenceLogLine) obj;
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
		return "AuditTrail.ReferenceLogLine";
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
