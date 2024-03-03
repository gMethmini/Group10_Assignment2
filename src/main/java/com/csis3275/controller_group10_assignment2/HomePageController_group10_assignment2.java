package com.csis3275.controller_group10_assignment2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.csis3275.model_group10_assignment2.TeamMember_group10_assignment2;

@Controller
public class HomePageController_group10_assignment2 {

	@GetMapping("/")
	public String loadHomePage(Model model) {
		List<TeamMember_group10_assignment2> teamMember = new ArrayList<>();
		teamMember.add(new TeamMember_group10_assignment2("Gayali_Kandane_Arachchige_Dona", "p2.jpg", 
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
		teamMember.add(new TeamMember_group10_assignment2("Dilpreet_Singh", "p22.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
		teamMember.add(new TeamMember_group10_assignment2("Tushar_Bhatia", "p33.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
	    model.addAttribute("teamMembers", teamMember);
		return "HomePage";
	}
	
	@GetMapping("/member/{name}")
    public String teamMember(@PathVariable String name, Model model) {
		 TeamMember_group10_assignment2 teamMember = loadTeamMemberByName(name);
		 model.addAttribute("teamMember", teamMember);
        return "Member";
    }
	
	 //Method to fetch team member details by name
    private TeamMember_group10_assignment2 loadTeamMemberByName(String name) {
        if ("Gayali_Kandane_Arachchige_Dona".equals(name)) {
            return new TeamMember_group10_assignment2("Gayali Kandane Arachchige Dona", "p2.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        } else if ("Dilpreet_Singh".equals(name)) {
            return new TeamMember_group10_assignment2("Dilpreet Singh", "p22.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        } else if ("Tushar_Bhatia".equals(name)) {
            return new TeamMember_group10_assignment2("Tushar Bhatia", "p33.jpg", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.");
        }else {
            return null;
        }
    }
}
