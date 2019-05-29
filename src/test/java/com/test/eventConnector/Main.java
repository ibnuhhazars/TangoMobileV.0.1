package com.test.eventConnector;

public class Main {
	
	private OnClick click = new OnClick();
	private OnSetText setText = new OnSetText();
	private OnSelectList selectList = new OnSelectList();
	private OnSwipe swipe = new OnSwipe();
	private OnVerify verify = new OnVerify();
	private OnEnter enter = new OnEnter();
	
	public OnSetText getSetText() {
		return setText;
	}

	public void setSetText(OnSetText setText) {
		this.setText = setText;
	}

	public OnVerify getVerify() {
		return verify;
	}

	public void setVerify(OnVerify verify) {
		this.verify = verify;
	}

	public OnSwipe getSwipe() {
		return swipe;
	}

	public void setSwipe(OnSwipe swipe) {
		this.swipe = swipe;
	}

	public OnSelectList getSelectList() {
		return selectList;
	}

	public void setSelectList(OnSelectList selectList) {
		this.selectList = selectList;
	}

	public OnClick getClick() {
		return click;
	}

	public void setClick(OnClick click) {
		this.click = click;
	}

	public OnEnter getEnter() {
		return enter;
	}

	public void setEnter(OnEnter enter) {
		this.enter = enter;
	}

}
