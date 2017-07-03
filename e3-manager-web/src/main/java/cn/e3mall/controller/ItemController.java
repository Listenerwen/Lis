package cn.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.common.pojo.E3Result;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;

/**
 * 
 * @ClassName ItemController
 * @Description 商品管理Controller
 * @author 是梦就会醒
 * @date 2017年6月28日 下午5:42:57
 */
@Controller
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
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem getItemById(@PathVariable long itemId) {
		TbItem tbItem = itemService.getItemById(itemId);
		return tbItem;
	}

	/**
	 * 分页查询商品
	 * 
	 * @param page
	 *            起始页
	 * @param rows
	 *            每页显示记录数
	 * @return
	 */
	@RequestMapping("/item/list")
	@ResponseBody
	public DataGridResult getItemList(@RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "30") int rows) {
		DataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	@RequestMapping("/item/save")
	@ResponseBody
	public E3Result addItem(TbItem item, String desc) {
		E3Result result = itemService.addItem(item, desc);
		return result;
	}
	

}
