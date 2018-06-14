package com.getFootballData.service;

import org.springframework.stereotype.Service;

import com.getFootballData.dto.TeamsFixturesDto;

@Service
public interface GetFootballDataService {

	/**
	 * 指定したチームIDのシーズンの戦績を取得します。<br />
	 * @param teamId チームID
	 * @param season シーズン(exp:"2017-2018"シーズンの場合は2017を指定する)
	 * @return 戦績
	 */
	public TeamsFixturesDto getMatchresults(String teamId, String season);

	/**
	 * ロシアワールドカップの戦績を取得します。<br />
	 * @return
	 */
	public TeamsFixturesDto getRussiaWCMatchresults();

}
