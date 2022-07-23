package com.bank.irrigation.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.bank.irrigation.model.PlotOfLand;
import com.bank.irrigation.service.PlotOfLandService;

@Component
public class StartupApp implements CommandLineRunner {

	@Autowired
	private PlotOfLandService plotOfLandService;

	public void run(String... args) throws Exception {

		// adding some data for Lands
		if (plotOfLandService.findAll().isEmpty()) {
			PlotOfLand Land1 = new PlotOfLand();
			Land1.setName("Farmland");
			Land1.setPrice(20000);
			Land1.setArea(1);
			Land1.setHeight(333);
			Land1.setWidth(44);

			PlotOfLand Land2 = new PlotOfLand();
			Land2.setName("desertland");
			Land2.setPrice(90000);
			Land2.setArea(9);
			Land2.setHeight(888);
			Land2.setWidth(33);

			PlotOfLand Land3 = new PlotOfLand();
			Land3.setName("The land belongs to the bank");
			Land3.setPrice(60000);
			Land3.setArea(5);
			Land3.setHeight(33366);
			Land3.setWidth(88);

			plotOfLandService.insertAll(Arrays.asList(Land1, Land2, Land3));
		}

	}

}
