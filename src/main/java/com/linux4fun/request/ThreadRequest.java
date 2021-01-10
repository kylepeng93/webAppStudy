package com.linux4fun.request;

import java.time.Duration;

import javax.validation.constraints.NotNull;

public class ThreadRequest {
	
	@NotNull
	private final String user;
	
	@NotNull
	private final Duration duration;

	public String getUser() {
		return user;
	}

	public Duration getDuration() {
		return duration;
	}

	public ThreadRequest(@NotNull String user, @NotNull Duration duration) {
		this.user = user;
		this.duration = duration;
	}

}
