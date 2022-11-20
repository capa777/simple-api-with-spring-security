package com.capa.springsecurityapp;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WishingController {

    private List<Wishing> wishings;

    public WishingController() {
        this.wishings = new ArrayList<>();
        wishings.add(new Wishing("W ten wigilijny dzień zaśnieżony, kiedy w kościele uderzą dzwony, przyjmijcie gorące życzenia radości, a w Nowym Roku szczęścia, zdrowia i pomyślności.",Season.XMAS));
        wishings.add(new Wishing("Gwiazdki najjaśniejszej, choinki najpiękniejszej, prezentów wymarzonych, Świąt mile spędzonych, karnawału szalonego roku bardzo udanego.",Season.XMAS));
        wishings.add(new Wishing("Życzę Wam wiosny w życiu codziennym, rodzinnym, w pracy,na koncie bankowym ale przede wszystkim życzę Wam wiosny w sercu",Season.EASTER));

    }
    @GetMapping("/wishing")
    public List<Wishing> getWishing(){return wishings;}

    @PostMapping("/wishing")
    public boolean addWishing(@RequestBody Wishing wishing){
        return wishings.add(wishing);
    }

    @DeleteMapping("/wishing")
    public void deleteWishing(@RequestParam int indexToDelete){
        wishings.remove(indexToDelete);
    }
}
