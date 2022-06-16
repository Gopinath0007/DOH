// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emiratesservice.proxies;

public class Attachmentss
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject attachmentssMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmiratesService.Attachmentss";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Attachmentss_Root("EmiratesService.Attachmentss_Root");

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

	public Attachmentss(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmiratesService.Attachmentss"));
	}

	protected Attachmentss(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject attachmentssMendixObject)
	{
		if (attachmentssMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EmiratesService.Attachmentss", attachmentssMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmiratesService.Attachmentss");

		this.attachmentssMendixObject = attachmentssMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Attachmentss.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emiratesservice.proxies.Attachmentss initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emiratesservice.proxies.Attachmentss.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emiratesservice.proxies.Attachmentss initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emiratesservice.proxies.Attachmentss(context, mendixObject);
	}

	public static emiratesservice.proxies.Attachmentss load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emiratesservice.proxies.Attachmentss.initialize(context, mendixObject);
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
	 * @return value of Attachmentss_Root
	 */
	public final emiratesservice.proxies.Root getAttachmentss_Root() throws com.mendix.core.CoreException
	{
		return getAttachmentss_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Attachmentss_Root
	 */
	public final emiratesservice.proxies.Root getAttachmentss_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emiratesservice.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Attachmentss_Root.toString());
		if (identifier != null)
			result = emiratesservice.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Attachmentss_Root
	 * @param attachmentss_root
	 */
	public final void setAttachmentss_Root(emiratesservice.proxies.Root attachmentss_root)
	{
		setAttachmentss_Root(getContext(), attachmentss_root);
	}

	/**
	 * Set value of Attachmentss_Root
	 * @param context
	 * @param attachmentss_root
	 */
	public final void setAttachmentss_Root(com.mendix.systemwideinterfaces.core.IContext context, emiratesservice.proxies.Root attachmentss_root)
	{
		if (attachmentss_root == null)
			getMendixObject().setValue(context, MemberNames.Attachmentss_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Attachmentss_Root.toString(), attachmentss_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return attachmentssMendixObject;
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
			final emiratesservice.proxies.Attachmentss that = (emiratesservice.proxies.Attachmentss) obj;
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
		return "EmiratesService.Attachmentss";
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