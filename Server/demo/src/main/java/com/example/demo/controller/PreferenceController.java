package com.example.demo.controller;

import com.example.demo.entity.Preference;
import com.example.demo.service.IPreferenceService;
import com.example.demo.util.basic.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Ye Suyuan
 * @since 2021-03-17
 */
@RestController
@ResponseBody
@RequestMapping("/preference")
public class PreferenceController {

    @Autowired
    IPreferenceService iPreferenceService;

    @RequestMapping(value = "insert", method = RequestMethod.POST)
    public String insert(Preference preference){
        try{
            return JsonResult.success(iPreferenceService.insert(preference));
        }catch (Exception e){
            e.printStackTrace();
            return JsonResult.error();
        }
    }

    @RequestMapping(value = "select", method = RequestMethod.POST)
    public String select(Preference preference){
        try{
            return JsonResult.success(iPreferenceService.select(preference));
        }catch (Exception e){
            e.printStackTrace();
            return JsonResult.error();
        }
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Preference preference){
        try{
            return JsonResult.success(iPreferenceService.updateById(preference));
        }catch (Exception e){
            e.printStackTrace();
            return JsonResult.error();
        }
    }

}
