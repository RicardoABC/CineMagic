package com.Booster.CineMagic.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Booster.CineMagic.Entities.Billboard;
import com.Booster.CineMagic.Services.IBillboardService;

@RestController
@RequestMapping("/CineMagic/v0")
public class BillboardController
{
    @Autowired
    IBillboardService billboardService;

    @PostMapping("/Billboard")
    public Billboard AddBillboard(@RequestBody Billboard newBillboard)
    {
        return billboardService.AddBillboard(newBillboard);
    }

    @GetMapping("/Billboard")
    public List<Billboard> GetBillboard()
    {
        return billboardService.GetBillboard();
    }

    @GetMapping("Billboard/{idBillboard}")
    public Billboard GetBillboardByID(@PathVariable Long idBillboard)
    {
        return billboardService.GetBillboardByID(idBillboard);
    }

    @PutMapping("/Billboard/{idBillboard}")
    public Billboard UpdateBillboard(@PathVariable Long idBillboard, @RequestBody Billboard billboard)
    {
        return billboardService.UpdateBillboard(idBillboard, billboard);
    }

    @DeleteMapping("/Billboard/{idBillboard}")
    public Boolean DeleteBillboard(@PathVariable Long idBillboard)
    {
        return billboardService.DeleteBillboard(idBillboard);
    }
}