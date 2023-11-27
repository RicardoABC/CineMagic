package com.Booster.CineMagic.Services;

import java.util.List;
import com.Booster.CineMagic.Entities.Billboard;

public interface IBillboardService
{
    // Create
    Billboard AddBillboard(Billboard newBillboard);

    // Read
    List<Billboard> GetBillboard();
    Billboard GetBillboardByID(Long idBillboard);

    // Update
    Billboard UpdateBillboard(Long idBillboard, Billboard billboard);

    // Delete
    Boolean DeleteBillboard(Long idBillboard);
}