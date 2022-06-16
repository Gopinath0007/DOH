// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package emiratesservice.proxies;

public class Infants
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject infantsMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "EmiratesService.Infants";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Infants_Root("EmiratesService.Infants_Root");

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

	public Infants(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "EmiratesService.Infants"));
	}

	protected Infants(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject infantsMendixObject)
	{
		if (infantsMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("EmiratesService.Infants", infantsMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a EmiratesService.Infants");

		this.infantsMendixObject = infantsMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Infants.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static emiratesservice.proxies.Infants initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return emiratesservice.proxies.Infants.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static emiratesservice.proxies.Infants initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new emiratesservice.proxies.Infants(context, mendixObject);
	}

	public static emiratesservice.proxies.Infants load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return emiratesservice.proxies.Infants.initialize(context, mendixObject);
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
	 * @return value of Infants_Root
	 */
	public final emiratesservice.proxies.Root getInfants_Root() throws com.mendix.core.CoreException
	{
		return getInfants_Root(getContext());
	}

	/**
	 * @param context
	 * @return value of Infants_Root
	 */
	public final emiratesservice.proxies.Root getInfants_Root(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		emiratesservice.proxies.Root result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Infants_Root.toString());
		if (identifier != null)
			result = emiratesservice.proxies.Root.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Infants_Root
	 * @param infants_root
	 */
	public final void setInfants_Root(emiratesservice.proxies.Root infants_root)
	{
		setInfants_Root(getContext(), infants_root);
	}

	/**
	 * Set value of Infants_Root
	 * @param context
	 * @param infants_root
	 */
	public final void setInfants_Root(com.mendix.systemwideinterfaces.core.IContext context, emiratesservice.proxies.Root infants_root)
	{
		if (infants_root == null)
			getMendixObject().setValue(context, MemberNames.Infants_Root.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Infants_Root.toString(), infants_root.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return infantsMendixObject;
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
			final emiratesservice.proxies.Infants that = (emiratesservice.proxies.Infants) obj;
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
		return "EmiratesService.Infants";
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