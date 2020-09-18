package com.demo.implQ2;

import com.demo.interfacesQ2.TvRemote;

public class BPLTv implements TvRemote {

	@Override
	public void getTvInfo() {

		System.out.println("hello BPLTv remote");
	}

}
