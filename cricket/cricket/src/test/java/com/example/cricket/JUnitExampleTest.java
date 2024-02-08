package com.example.cricket;


import com.example.cricket.entity.Player;
import com.example.cricket.service.ManagerService;
import com.example.cricket.service.PlayerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
public class JUnitExampleTest {

    @Autowired
    ManagerService managerService;
    @Autowired
    PlayerService playerService;

    @Test
    void login() {
        managerService.addManager("Chennai Super Kings", "password1", "https://www.hdwallpapers.in/download/chennai_super_kings_logo_in_black_background_hd_sports-1920x1080.jpg","#e2e600" );
        managerService.addManager("Royal Challengers Bangalore", "password1","https://images.indiafantasy.com/wp-content/uploads/20230313150350/RCB-logo-1.png","#e60f00");
        managerService.addManager("Mumbai Indians","password1","https://upload.wikimedia.org/wikipedia/en/thumb/c/cd/Mumbai_Indians_Logo.svg/1280px-Mumbai_Indians_Logo.svg.png","#0082e6");
        managerService.addManager("Delhi Daredevils","password1","https://www.pngall.com/wp-content/uploads/2017/04/Delhi-Daredevils-Logo-PNG.png","#e60f00");
        var manager = managerService.findManager("Chennai Super Kings", "password1");
        Assertions.assertNotNull(manager);
        Assertions.assertEquals("Chennai Super Kings", manager.getTeamName());
        Assertions.assertEquals("password1", manager.getPassword());
    }
    @Test
    void wrongLogin() {
        var manager = managerService.findManager("Chennai Super Kings", "wrong");
        Assertions.assertNull(manager);
    }
    @Test
    void player() {
        playerService.addPlayer("Rohit Sharma",
                 "Batsman",
                 "150000",
                "Mumbai Indians",
                "https://th.bing.com/th/id/OIP.8CwquY7KLMLqC5pF5NX3IwHaNK?w=115&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "Good captain but sadly sacked by team management",
                "Poor batting form in IPL",
                "Fit");
        playerService.addPlayer( "Jadeja",
                "All-rounder (spin)",
                "160000",
                 "Chennai Super Kings",
                 "https://th.bing.com/th/id/OIP.YKJeXboI69ZZTIFDmCtLhgHaIm?w=157&h=183&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                 "Excellent fielder, good economy with the ball and a reliable batsman",
                 "None",
                "Fit");
        playerService.addPlayer( "Bravo",
                "All-rounder (pace)",
                 "60000",
                 "Chennai Super Kings",
                "https://th.bing.com/th/id/OIP.xD5IZbU6R7Jsg3erKapJhAHaI_?w=148&h=181&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                 "Good fielder and death bowler",
                "Sometimes expensive with the ball",
                 "Injured");
        playerService.addPlayer( "Virat Kohli",
                 "Batsman",
                "170000",
                 "Royal Challengers Bangalore",
                "https://th.bing.com/th/id/OIP.pvm3I2pkvCPjLmAwfQGB9QHaHB?w=195&h=184&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                 "Consistent batsman",
                "Slight weakness against spin",
                 "Fit");
        playerService.addPlayer("Jasprit Bumrah",
                 "Fast Bowler",
                "110000",
                "Mumbai Indians",
                "https://th.bing.com/th/id/OIP.V87hDkmUrfBP01W4QUsVhwAAAA?w=161&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                 "Best death bowler",
                "None",
                "Fit");
        playerService.addPlayer("Pollard",
                "All-rounder (pace)",
                 "90000",
                 "Mumbai Indians",
                "https://th.bing.com/th/id/OIP.3S98fgqlloewXlWLxGllRwHaE8?w=242&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "Aggressive Batsman",
                "None",
                 "Fit");
        playerService.addPlayer("MS Dhoni",
                "Wicket-keeper Batsman Captain ",
                "120000",
                "Chennai Super Kings",
                "https://th.bing.com/th/id/OIP.dUs1TjVA88Rj3GVfD594mQHaJQ?w=140&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "Best wicket-keeper and an excellent captain ",
                "Poor batting Form",
                "Injured");
        playerService.addPlayer("Hardik Pandya",
                "All-rounder (pace)",
                "1000000",
                "Mumbai Indians",
                "https://th.bing.com/th/id/OIP.3S98fgqlloewXlWLxGllRwHaE8?w=242&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7",
                "Aggressive Batsman",
                "No",
                "Fit");

        var player = playerService.getPlayerByName("Rohit Sharma");
        Assertions.assertNotNull(player);
        Assertions.assertEquals("Rohit Sharma", player.getPlayerName());
    }

//    @Test
//    void expensivePlayer() {
//        List<Player> players = playerService.getExpensivePlayers();
//        Assertions.assertNotNull(players);
//        Assertions.assertEquals(8, players.size());
//    }
//    @Test
//    void playerMatch() {
//        List<Player> players = playerService.getMatchPlayers("dhon");
//       Assertions.assertEquals(1, players.size());
//       Assertions.assertEquals("MS Dhoni", players.get(0).getPlayerName());
//    }
}
