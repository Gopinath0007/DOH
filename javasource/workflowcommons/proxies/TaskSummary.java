// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package workflowcommons.proxies;

public class TaskSummary
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject taskSummaryMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "WorkflowCommons.TaskSummary";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NumberOfTasksOverdue("NumberOfTasksOverdue"),
		NumberOfTasksInProgress("NumberOfTasksInProgress"),
		NumberOfTasksFailed("NumberOfTasksFailed"),
		DashboardContext_TaskSummary("WorkflowCommons.DashboardContext_TaskSummary");

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

	public TaskSummary(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "WorkflowCommons.TaskSummary"));
	}

	protected TaskSummary(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject taskSummaryMendixObject)
	{
		if (taskSummaryMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("WorkflowCommons.TaskSummary", taskSummaryMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a WorkflowCommons.TaskSummary");

		this.taskSummaryMendixObject = taskSummaryMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TaskSummary.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static workflowcommons.proxies.TaskSummary initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return workflowcommons.proxies.TaskSummary.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static workflowcommons.proxies.TaskSummary initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new workflowcommons.proxies.TaskSummary(context, mendixObject);
	}

	public static workflowcommons.proxies.TaskSummary load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return workflowcommons.proxies.TaskSummary.initialize(context, mendixObject);
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
	 * @return value of NumberOfTasksOverdue
	 */
	public final java.lang.Integer getNumberOfTasksOverdue()
	{
		return getNumberOfTasksOverdue(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksOverdue
	 */
	public final java.lang.Integer getNumberOfTasksOverdue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksOverdue.toString());
	}

	/**
	 * Set value of NumberOfTasksOverdue
	 * @param numberoftasksoverdue
	 */
	public final void setNumberOfTasksOverdue(java.lang.Integer numberoftasksoverdue)
	{
		setNumberOfTasksOverdue(getContext(), numberoftasksoverdue);
	}

	/**
	 * Set value of NumberOfTasksOverdue
	 * @param context
	 * @param numberoftasksoverdue
	 */
	public final void setNumberOfTasksOverdue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftasksoverdue)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksOverdue.toString(), numberoftasksoverdue);
	}

	/**
	 * @return value of NumberOfTasksInProgress
	 */
	public final java.lang.Integer getNumberOfTasksInProgress()
	{
		return getNumberOfTasksInProgress(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksInProgress
	 */
	public final java.lang.Integer getNumberOfTasksInProgress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksInProgress.toString());
	}

	/**
	 * Set value of NumberOfTasksInProgress
	 * @param numberoftasksinprogress
	 */
	public final void setNumberOfTasksInProgress(java.lang.Integer numberoftasksinprogress)
	{
		setNumberOfTasksInProgress(getContext(), numberoftasksinprogress);
	}

	/**
	 * Set value of NumberOfTasksInProgress
	 * @param context
	 * @param numberoftasksinprogress
	 */
	public final void setNumberOfTasksInProgress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftasksinprogress)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksInProgress.toString(), numberoftasksinprogress);
	}

	/**
	 * @return value of NumberOfTasksFailed
	 */
	public final java.lang.Integer getNumberOfTasksFailed()
	{
		return getNumberOfTasksFailed(getContext());
	}

	/**
	 * @param context
	 * @return value of NumberOfTasksFailed
	 */
	public final java.lang.Integer getNumberOfTasksFailed(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.NumberOfTasksFailed.toString());
	}

	/**
	 * Set value of NumberOfTasksFailed
	 * @param numberoftasksfailed
	 */
	public final void setNumberOfTasksFailed(java.lang.Integer numberoftasksfailed)
	{
		setNumberOfTasksFailed(getContext(), numberoftasksfailed);
	}

	/**
	 * Set value of NumberOfTasksFailed
	 * @param context
	 * @param numberoftasksfailed
	 */
	public final void setNumberOfTasksFailed(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer numberoftasksfailed)
	{
		getMendixObject().setValue(context, MemberNames.NumberOfTasksFailed.toString(), numberoftasksfailed);
	}

	/**
	 * @return value of DashboardContext_TaskSummary
	 */
	public final workflowcommons.proxies.DashboardContext getDashboardContext_TaskSummary() throws com.mendix.core.CoreException
	{
		return getDashboardContext_TaskSummary(getContext());
	}

	/**
	 * @param context
	 * @return value of DashboardContext_TaskSummary
	 */
	public final workflowcommons.proxies.DashboardContext getDashboardContext_TaskSummary(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		workflowcommons.proxies.DashboardContext result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.DashboardContext_TaskSummary.toString());
		if (identifier != null)
			result = workflowcommons.proxies.DashboardContext.load(context, identifier);
		return result;
	}

	/**
	 * Set value of DashboardContext_TaskSummary
	 * @param dashboardcontext_tasksummary
	 */
	public final void setDashboardContext_TaskSummary(workflowcommons.proxies.DashboardContext dashboardcontext_tasksummary)
	{
		setDashboardContext_TaskSummary(getContext(), dashboardcontext_tasksummary);
	}

	/**
	 * Set value of DashboardContext_TaskSummary
	 * @param context
	 * @param dashboardcontext_tasksummary
	 */
	public final void setDashboardContext_TaskSummary(com.mendix.systemwideinterfaces.core.IContext context, workflowcommons.proxies.DashboardContext dashboardcontext_tasksummary)
	{
		if (dashboardcontext_tasksummary == null)
			getMendixObject().setValue(context, MemberNames.DashboardContext_TaskSummary.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.DashboardContext_TaskSummary.toString(), dashboardcontext_tasksummary.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return taskSummaryMendixObject;
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
			final workflowcommons.proxies.TaskSummary that = (workflowcommons.proxies.TaskSummary) obj;
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
		return "WorkflowCommons.TaskSummary";
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
