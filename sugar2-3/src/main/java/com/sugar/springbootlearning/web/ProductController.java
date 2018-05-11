package com.sugar.springbootlearning.web;

import com.sugar.springbootlearning.entity.ModifyProductOption;
import com.sugar.springbootlearning.entity.Product;
import com.sugar.springbootlearning.entity.CreateProductOption;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController               //@RestController: 可以返回json 相比较于@Controller
@RequestMapping("/product")  // @RequestMapping :配置URL映射
public class ProductController {

    /**
     * date: 2018-05-11
     * author： yangshuting
     * */
    @ApiOperation("创建产品")
    @RequestMapping(value = "", method = RequestMethod.POST)
    public boolean createProduct(@RequestBody CreateProductOption CreateProductOption){
        return true;
    }

    @ApiOperation("获取产品")
    @RequestMapping(value = "/{productId}", method = RequestMethod.GET)
    public Product getProduct(@PathVariable long productId){
        Product product = new Product();
        product.setId(productId);
        product.setName("笔记本");
        product.setDeleted(0);
        return product;
    }

    @ApiOperation("更新产品")
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public boolean modifyProduct(@RequestBody ModifyProductOption option){
       return true;
    }

    @ApiOperation("删除产品")
    @RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
    public boolean removeProduct(@PathVariable long productId){
        return true;
    }
}
