package com.bt.exception;

import java.util.ArrayList;
import java.util.List;

import com.bt.model.message.InternalMessage;
import com.bt.model.message.MessageLevel;

/**
 * This exception should only be used to stop processing immediately for a known
 * reason. All other exceptions should bubble up to the API/Interface layer.
 * Don't use this to wrap other exceptions.
 */
@SuppressWarnings("serial")
public class BtException extends RuntimeException {

	private List<InternalMessage> errorMessages = new ArrayList<>();

	public BtException(String errorCode, Object... args) {
		addErrorMessage(new InternalMessage(errorCode, MessageLevel.ERROR, args));
	}

	public BtException(List<InternalMessage> errorMessages) {
		setErrorMessages(errorMessages);
	}

	public List<InternalMessage> getErrorMessages() {
		return errorMessages;
	}

	public void setErrorMessages(List<InternalMessage> errorMessages) {
		this.errorMessages = errorMessages;
	}

	public void addErrorMessage(InternalMessage errorMessage) {
		this.errorMessages.add(errorMessage);
	}

}
