package com.getFootballData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.getFootballData.dto.TeamsFixturesDto;
import com.getFootballData.service.GetFootballDataService;

@Controller
public class GetFootballDataController {

	@Autowired
	private GetFootballDataService service;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(Model model) {
		// TODO とりあえず2017-2018シーズン固定 将来的には画面から取得する
		String season = "2017";
		String teamId = "65";
		TeamsFixturesDto dto = service.getMatchresults(teamId, season);
		model.addAttribute("TeamsFixturesDto", dto);
		return "index";
	}

	@RequestMapping(value="/search/{teamId}", method = RequestMethod.GET)
	public String  search(@PathVariable String teamId, Model model) {
		String season = "2017";
		TeamsFixturesDto dto = service.getMatchresults(teamId, season);
		 model.addAttribute("TeamsFixturesDto", dto);
		// return "index";
		return "index :: result";
	}
}
