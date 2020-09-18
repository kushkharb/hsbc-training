package com.demo.implQ2;

import com.demo.interfacesQ2.TvRemote;

public class MainApp {

	public static void main(String[] args) {

		TvRemote tr;
		
		BPLTv b=new BPLTv();
		PanasonicTv p=new PanasonicTv();
		SonyTv s=new SonyTv();
		
		tr=b;
		tr.getTvInfo();
		
		tr=p;
		tr.getTvInfo();
		
		tr=s;
		tr.getTvInfo();
	}

}
