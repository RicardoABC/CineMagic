package com.Booster.CineMagic.Services;

import java.util.List;
import java.util.Optional;

import com.Booster.CineMagic.Entities.Billboard;
import com.Booster.CineMagic.Repositories.IBillboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillboardService implements IBillboardService
{
    @Autowired
    IBillboardRepository billboardRepository;

    @Override
    public Billboard AddBillboard(Billboard newBillboard)
    {
        return billboardRepository.save(newBillboard);
    }

    @Override
    public List<Billboard> GetBillboard()
    {
        return billboardRepository.findAll();
    }

    @Override
    public Billboard GetBillboardByID(Long idBillboard)
    {
        return billboardRepository.findById(idBillboard).orElse(null);
    }

    @Override
    public Billboard UpdateBillboard(Long idBillboard, Billboard billboard)
    {
        Optional<Billboard> billboard2Update = billboardRepository.findById(idBillboard);

        if (!billboard2Update.isPresent())
            return null;
        
        Billboard updateBillboard = billboard2Update.get();

        updateBillboard.setMovieID(billboard.getMovieID());
        updateBillboard.setLanguage(billboard.getLanguage());
        updateBillboard.setMovieSchedule(billboard.getMovieSchedule());

        return billboardRepository.save(updateBillboard);
    }

    @Override
    public Boolean DeleteBillboard(Long idBillboard)
    {
        if (this.GetBillboardByID(idBillboard) == null)
            return null;
        
        billboardRepository.deleteById(idBillboard);

        return (this.GetBillboardByID(idBillboard) == null)? true : false;
    }
}