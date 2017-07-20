package net.ibizsys.paas.ctrlmodel;

import java.util.ArrayList;

import net.ibizsys.paas.control.tree.ITreeNode;
import net.ibizsys.paas.core.IModelBase;
import net.ibizsys.paas.ctrlhandler.ITreeNodeFetchContext;
import net.ibizsys.paas.db.IDataTable;

/**
 * 树节点类型模型接口
 * 
 * @author Administrator
 *
 */
public interface ITreeNodeModel extends IModelBase {
	/**
	 * 节点分隔符号
	 */
	static final String TREENODE_SEPARATOR = ";";

	/**
	 * 根节点标识
	 */
	static String ROOTNODEID = "root";

	/**
	 * 静态
	 */
	final static String TREENODETYPE_STATIC = "STATIC";

	/**
	 * 动态（实体）
	 */
	final static String TREENODETYPE_DE = "DE";

	/**
	 * 动态（代码表）
	 */
	final static String TREENODETYPE_CODELIST = "CODELIST";

	// 定义节点选择处理代码表

	/**
	 * 页面链接
	 */
	final static String NODEACTION_PAGELINK = "PAGELINK";

	/**
	 * 脚本执行
	 */
	final static String NODEACTION_JAVASCRIPT = "JAVASCRIPT";

	/**
	 * 获取实体名称
	 * 
	 * @return
	 */
	String getDEName();
	
	/**
	 * 获取树节点关系关系
	 * 
	 * @return
	 */
	java.util.Iterator<ITreeNodeRSModel> getTreeNodeRSModels();

	/**
	 * 获取节点类型
	 * 
	 * @return
	 */
	String getTreeNodeType();

	/**
	 * 填充数据返回结果
	 * 
	 * @param iTreeNodeFetchContext
	 * @param treeNodeList
	 * @throws Exception
	 */
	void fillFetchResult(ITreeNodeFetchContext iTreeNodeFetchContext, ArrayList<ITreeNode> treeNodeList) throws Exception;

	/**
	 * 填充结果
	 * 
	 * @param iTreeNodeFetchContext
	 * @param treeNodeList
	 * @param dt
	 * @throws Exception
	 */
	void fillFetchResult(ITreeNodeFetchContext iTreeNodeFetchContext, ArrayList<ITreeNode> treeNodeList, IDataTable dt) throws Exception;

	/**
	 * 是否附加父节点标识
	 * 
	 * @return
	 */
	boolean isAppendPNodeId();

	/**
	 * 获取图标样式
	 * 
	 * @return
	 */
	String getIconCls();

	/**
	 * 节点是否展开
	 * 
	 * @return
	 */
	boolean isExpanded();

	/**
	 * 是否支持选中
	 * 
	 * @return
	 */
	boolean isEnableCheck();

	/**
	 * 获取节点类型
	 * 
	 * @return
	 */
	String getNodeType();

	/**
	 * 是否被选中
	 * 
	 * @return
	 */
	boolean isChecked();

	/**
	 * 是否为根节点
	 * 
	 * @return
	 */
	boolean isRootNode();

	/**
	 * 拥有关系模型
	 * 
	 * @return
	 */
	boolean hasTreeNodeRSModel();
}
