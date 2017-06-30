package cn.e3mall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.TreeNode;
import cn.e3mall.service.ItemCatService;

/**
 * 商品分类管理Controller
 * <p>Title: ItemCatController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.cn</p> 
 * @version 1.0
 */
@Controller
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;

	@RequestMapping("/item/cat/list")
	@ResponseBody
	public List<TreeNode> getItemCatList(@RequestParam(name="id", defaultValue="0")long parentId) {
		List<TreeNode> itemCatList = itemCatService.getItemCatList(parentId);
		//返回结果
		return itemCatList;
	}
}
