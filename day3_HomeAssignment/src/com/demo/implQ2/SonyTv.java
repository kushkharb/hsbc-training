package com.demo.implQ2;

import com.demo.interfacesQ2.TvRemote;

public class SonyTv implements TvRemote {

	@Override
	public void getTvInfo() {

		System.out.println("hello Sonytv remote");
	}

}
