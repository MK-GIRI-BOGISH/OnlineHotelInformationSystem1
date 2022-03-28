package com.project.Exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ExceptionResponse {
	private String errorMessage;
	private String errorCode;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-mm-yyyy hh:mm:ss")
	private LocalDateTime timeStamp;
	public String getErrorCode() {
	return errorCode;
	}
	public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
	}
	public String getErrorMessage() {
	return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
	}
	public LocalDateTime getTimestamp() {
	return timeStamp;

	}
	public void setTimestamp(LocalDateTime timeStamp) {
	this.timeStamp=timeStamp;

	}
}

