package com.demo.implQ2;

import com.demo.interfacesQ2.TvRemote;

public class PanasonicTv implements TvRemote {

	@Override
	public void getTvInfo() {

		System.out.println("hello panasonicTv remotes");
	}

}
