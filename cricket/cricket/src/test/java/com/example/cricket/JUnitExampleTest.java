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
        managerService.addManager("Chennai Super Kings", "password1", "simp","yellow" );
        var manager = managerService.findManager("Chennai Super Kings", "password1");
        Assertions.assertNotNull(manager);
        Assertions.assertEquals("Chennai Super Kings", manager.getTeamName());
        Assertions.assertEquals("password1", manager.getPassword());
    }
//    }
//    @Test
//    void wrongLogin() {
//        var manager = managerService.findManager("Chennai Super Kings", "wrong");
//        Assertions.assertNull(manager);
//    }
//    @Test
//    void player() {
//        var player = playerService.getPlayerByName("Rohit Sharma");
//        Assertions.assertNotNull(player);
//        Assertions.assertEquals("Rohit Sharma", player.getPlayerName());
//    }
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
