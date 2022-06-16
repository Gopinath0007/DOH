// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package system.proxies;

/**
 * Represents that execution status of a task in a task queue.
 * * Idle: The task was created and is waiting to be executed.
 * * Running: The task is being executed.
 * * Completed: The task executed successfully. A System.ProcessedQueueTask is added to reflect this.
 * * Failed: The task is no longer executing, because an exception occurred. A System.ProcessedQueueTask containing the exception is added to reflect the failure. The task will not be retried.
 * * Aborted: The task is no longer executing, because the cluster node that was executing it went down. A System.ProcessedQueueTask is added to reflect this. The task will be retried on another cluster node.
 * * Incompatible: The task never executed, because the model changed in such a way that it cannot be executed anymore. This could be because the microflow was removed/renamed, the arguments were changed or the Task Queue was removed.
 */
public enum QueueTaskStatus
{
	Idle(new java.lang.String[][] { new java.lang.String[] { "en_US", "Idle" } }),
	Running(new java.lang.String[][] { new java.lang.String[] { "en_US", "Running" } }),
	Completed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Completed" } }),
	Failed(new java.lang.String[][] { new java.lang.String[] { "en_US", "Failed" } }),
	Aborted(new java.lang.String[][] { new java.lang.String[] { "en_US", "Aborted" } }),
	Incompatible(new java.lang.String[][] { new java.lang.String[] { "en_US", "Incompatible" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private QueueTaskStatus(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}
