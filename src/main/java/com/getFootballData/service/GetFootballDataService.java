package com.getFootballData.service;

import org.springframework.stereotype.Service;

import com.getFootballData.dto.TeamsFixturesDto;

@Service
public interface GetFootballDataService {

	public TeamsFixturesDto getMatchresults(String teamId, String seaso);

}
