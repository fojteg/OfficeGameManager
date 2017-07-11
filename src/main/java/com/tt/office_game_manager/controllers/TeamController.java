package com.tt.office_game_manager.controllers;

import com.tt.office_game_manager.entities.Team;
import com.tt.office_game_manager.repositories.TeamRepository;
import com.tt.office_game_manager.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * Created by niemiecw on 11.07.2017.
 */

@Controller
@RequestMapping("/teams")
public class TeamController {
    private final TeamService teamRepository;

    @Autowired
    TeamController(TeamService teamService) {
        super();
        this.teamRepository = teamService;
    }

    @RequestMapping("/{teamId}")
    @ResponseBody
    public Team getTeam(@PathVariable("teamId") Long teamId) {
        return teamRepository.getTeam(teamId);
    }

    @RequestMapping("/")
    @ResponseBody
    public Collection<Team> getTeams() {
        return teamRepository.getAllTeams();
    }
}
