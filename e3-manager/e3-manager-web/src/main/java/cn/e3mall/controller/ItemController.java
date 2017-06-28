package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 
 * @ClassName ItemController
 * @Description 商品管理Controller
 * @author 西忒乐
 * @date 2017年6月28日 下午5:42:57
 */
@Controller
@RequestMapping("item")
public class ItemController {

	// 注入service
	@Autowired
	private ItemService itemService;

	/**
	 * 根据ID查询商品
	 * 
	 * @param itemId
	 *            商品id
	 * @return
	 */
	@RequestMapping("{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable Long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

}
