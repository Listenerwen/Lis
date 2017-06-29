package cn.e3mall.service;

import cn.e3mall.common.pojo.DataGridResult;
import cn.e3mall.pojo.TbItem;

/**
 * 
 * @ClassName ItemService
 * @Description 商品管理Service接口
 * @author 西忒乐
 * @date 2017年6月28日 下午5:43:49
 */
public interface ItemService {

	/**
	 * 根据ID查询商品
	 * 
	 * @param itemId
	 *            商品id
	 * @return
	 */
	TbItem getItemById(Long itemId);

	/**
	 * 分页查询商品
	 * 
	 * @param page
	 *            起始页
	 * @param rows
	 *            每页显示记录数
	 * @return
	 */
	DataGridResult getItemList(int page, int rows);

}