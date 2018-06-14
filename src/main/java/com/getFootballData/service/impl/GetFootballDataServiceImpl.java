package com.getFootballData.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.getFootballData.dto.TeamsFixturesDto;
import com.getFootballData.service.GetFootballDataService;

@Service
public class GetFootballDataServiceImpl implements GetFootballDataService {

	 @Autowired
	 @Qualifier("getFootballDataServiceRestTemplate")
	 RestTemplate restTemplate;

	 private static final String URL = "http://api.football-data.org/v1/teams/{teamId}/fixtures?season={season}";

	 private static final String RUSSIA_WC_URL = "http://api.football-data.org/v1/competitions/467/fixtures";

	@Override
	public TeamsFixturesDto getMatchresults(String teamId, String season) {
		 return restTemplate.getForObject(URL,  TeamsFixturesDto.class, teamId, season);
	}

	@Override
	public TeamsFixturesDto getRussiaWCMatchresults() {
		return restTemplate.getForObject(RUSSIA_WC_URL,  TeamsFixturesDto.class);
	}

}
