package org.eclipse.cmf.occi.multicloud.monitoring.connector.exception;

public class MonitorException extends Exception {
	
	private static final long serialVersionUID = 3282676938521192384L;

	public MonitorException() {
		super();
	}

	public MonitorException(String message, Throwable cause) {
		super(message, cause);
	}

	public MonitorException(String message) {
		super(message);
	}

	public MonitorException(Throwable cause) {
		super(cause);
	}
}
