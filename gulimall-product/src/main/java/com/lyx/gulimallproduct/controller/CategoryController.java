package com.lyx.gulimallproduct.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lyx.gulimallproduct.entity.CategoryEntity;
import com.lyx.gulimallproduct.service.CategoryService;
import com.lyx.common.utils.PageUtils;
import com.lyx.common.utils.R;



/**
 * 商品三级分类
 *
 * @author liao
 * @email 2414690715from36@gmail.com
 * @date 2023-07-13 13:56:06
 */
@RestController
@RequestMapping("gulimallproduct/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    /**
     * 查出所有分类以树形结构
     * @return
     */
    @RequestMapping("/treeList")
    //@RequiresPermissions("gulimallproduct:category:list")
    public R treeList(){
        List<CategoryEntity> categories = categoryService.listWithTree();
        return R.ok().put("data",categories);

    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("gulimallproduct:category:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("gulimallproduct:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("gulimallproduct:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("gulimallproduct:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }


    @RequestMapping("/update/sort")
    //@RequiresPermissions("product:category:update")
    public R updateSort(@RequestBody CategoryEntity[] category){
        categoryService.updateBatchById(Arrays.asList(category));
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("gulimallproduct:category:delete")
    public R delete(@RequestBody Long[] catIds){
		//categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeMenuByIds(Arrays.asList(catIds));
        return R.ok();
    }

}
