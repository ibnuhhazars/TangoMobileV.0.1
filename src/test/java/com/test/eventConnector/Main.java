package com.test.eventConnector;

public class Main {
	
	private OnClick button = new OnClick();
	private OnSetText setText = new OnSetText();
	
	public OnClick getButton() {
		return button;
	}

	public void setButton(OnClick button) {
		this.button = button;
	}

	public OnSetText getSetText() {
		return setText;
	}

	public void setSetText(OnSetText setText) {
		this.setText = setText;
	}

}
