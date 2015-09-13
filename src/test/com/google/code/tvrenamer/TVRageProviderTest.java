package com.google.code.tvrenamer;

import org.junit.Ignore;
import org.junit.Test;

import com.google.code.tvrenamer.controller.TVRageProvider;
import com.google.code.tvrenamer.model.Show;

@Ignore
public class TVRageProviderTest {

	@Test
	public void testGetShowOptions() throws Exception {
		for (Show show : TVRageProvider.getShowOptions("Gossip Girl")) {
			System.out.println(show.getId() + " -> " + show.getName());
		}
	}

	@Test
	public void testGetShowListing() {
		TVRageProvider.getShowListing(new Show("15619", "Gossip Girl", "http://www.tvrage.com/Battlestar_Galactica"));
	}
}
