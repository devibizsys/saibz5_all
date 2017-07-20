package net.ibizsys.paas;

import net.ibizsys.paas.util.StringHelper;

/**
 * Runtime 版本信息
 * @author Administrator
 * 
 * @version 5.0.9.6
 * (1) 修改net.ibizsys.paas.service.ServiceBase 的 checkKey实现，解决虚拟主键的问题
 * 
 * @version 5.0.9.5
 * (1) 运行环境提供插件支持
 * 
 * @version 5.0.9.4
 * (1) 修复一些BUG及功能微调
 * 
 * @version 5.0.9.3
 * (1) 修复一些BUG及功能微调
 * 
 * * @version 5.0.9.2
 * (1) 修复一些BUG及功能微调
 * 
 * @version 5.0.9.1
 * (1) 修复一些BUG及功能微调
 * 
 * @version 5.0.9.0
 * (1) 大数据架构相关功能整体升级
 * 
 * @version 5.0.8.6
 * (1) net.ibizsys.paas.service.ServiceBase 添加递归检查方法checkFieldRecursionRule
 * 
 * 
 * @version 5.0.8.5
 * (1) 修复一些BUG及功能微调
 * 
 * @version 5.0.8.4
 * (1) 关系部件增强多语言支持
 * 
 * @version 5.0.8.3
 * (1) 工作流引擎增强多语言支持
 * 
 * @version 5.0.8.2
 * (1) 微信功能进行增强
 *  
 * @version 5.0.8.1
 * (1) 修复一些BUG及功能微调
 * (2) 微信功能进行增强
 * 
 * @version 5.0.8.0
 * (1) 正式支持多语言
 * 
 * @version 5.0.7.5
 * (1) 修复一些BUG及功能微调
 * 
 * @version 5.0.7.4
 * (1) net.ibizsys.paas.control.drctrl.IDRCtrlItem 增加了 getIconPathX、getIconClsX方法，用于支持不同显示大小的图片及样式，相关实现对象有调整
 * 
 * @version 5.0.7.3
 * (1) 增加Freemarker方法对象，net.ibizsys.paas.util.freemarker.CodeListMethod
 * 
 * @version 5.0.7.2
 * (1) 修改工作流表单处理对象net.ibizsys.pswf.ctrlhandler.WFEditFormHandlerBase 在处理临时数据权限判断问题 
 * 
 * @version 5.0.7.1
 * (1) 表单处理对象 net.ibizsys.paas.ctrlhandler.EditFormHandlerBase 在进行复制数据新建操作时，会进行新建模式的默认值填充（原来没有） 
 * 
 * @version 5.0.7.0
 * (1) 增加微信子系统
 * 
 * @version 5.0.6.4
 * (1) 修复net.ibizsys.paas.ctrlhandler.CtrlHandlerBase中getSimpleEntity在处理临时数据中返回空的问题，如存在正式数据会返回正式数据
 * 
 * @version 5.0.6.3 
 * (1) net.ibizsys.paas.appmodel.IApplicationModel  增加方法 testUserViewAccess ，视图控制器执行用户访问判断时先调用此方法，为外部程序提供统一的判断能力.
 * 
 * @version 5.0.6.2 
 * (1) 增强树部件相关能力，模型及处理对象都有调整
 * 
 * @version 5.0.6.1 
 * (1) net.ibizsys.paas.dao.IDAO 增加新的数据查询获取方法  fetchDEDataQuery(ISelectContext iSelectContext, boolean bTempMode)
 * (2) net.ibizsys.paas.service.ServiceBase 增强 select(ISelectCond iSelectCond2) 方法，支持直接调用数据查询
 * 
 * @version 5.0.6.0
 * (1) 增强视图向导及视图消息模块
 * 
 * @version 5.0.5.7
 * (1) net.ibizsys.paas.web.util.RemoteLoginServlet 在认证完成后，进一步调用WebContext.fillByLoginAccount填充用户信息
 * 
 * @version 5.0.5.6
 * (1) net.ibizsys.paas.service.IService 增强save方法，可进一步指定是否返回数据等
 * 
 * @version 5.0.5.5
 * (1) net.ibizsys.paas.service.ServiceBase 相关临时数据行为支持逻辑附加
 * (2) net.ibizsys.paas.sysmodel.CodeListGlobal 支持插件net.ibizsys.paas.sysmodel.ICodeListGlobalPlugin
 * (3) net.ibizsys.paas.controller.ViewControllerGlobal 支持插件net.ibizsys.paas.controller.IViewControllerGlobalPlugin
 * (4) net.ibizsys.paas.ctrlhandler.CounterGlobal 支持插件net.ibizsys.paas.ctrlhandler.ICounterGlobalPlugin 
 *
 * @version 5.0.5.4
 * (1) 一些功能微调
 * 
 * @version 5.0.5.3
 * (1) 表单项输入提示后台处理支持
 * 
 * @version 5.0.5.2
 * (1) 修复WebContext一些静态变量的命名错误
 * 
 * @version 5.0.5.1
 * (1) 修复部件界面行为在临时数据下检查权限的错误
 * 
 * @version 5.0.5.0
 * (1) 支持PPAS及PostgreSQL数据库
 * 
 * @version 5.0.4.25
 * (1) 修复后台界面行为判断用户权限出现的错误
 * 
 * @version 5.0.4.24
 * (1) 实体数据集合 net.ibizsys.paas.core.IDEDataSet 继承net.ibizsys.paas.core.IDEDataRange接口，增强数据范围定义能力
 * 
 * @version 5.0.4.23
 * (1) 修复表单及表格编辑器输出的代码表配置的错误
 *  
 * @version 5.0.4.22
 * (1) net.ibizsys.paas.ctrlmodel.IGridEditItemModel及net.ibizsys.paas.ctrlmodel.IFormItemModel增强获取输出的代码表配置模式 getOutputCodeListConfigMode，相应的实现类有修改。
 *
 * @version 5.0.4.21
 * (1) 增强net.ibizsys.paas.web.Page的createWebContext方法，如存在应用，则调用应用建立
 * 
 * @version 5.0.4.20
 * (1) 增强SQLite数据库支持
 * 
 * @version 5.0.4.19
 * (1) 修复数据导出的列权限控制问题
 * 
 * @version 5.0.4.18
 * (1) 工作流取消流程置空用户数据实例值
 * (2) 修复net.ibizsys.paas.db.impl.MSSQLDialectImpl获取当前时间的问题
 * 
 * @version 5.0.4.17
 * (1) 增强视图消息功能
 * (2) 增强数据导出功能，增加了net.ibizsys.paas.demodel.DEDataExportModelBase等相关对象，net.ibizsys.paas.ctrlhandler.MDCtrlHandlerBase等对象也做了相应调整
 * 
 * @version 5.0.4.16
 * (1) 实体模型添加存储模式定义
 * (2) 增强大数据功能，net.ibizsys.paas.service.ServiceBase等对象进行增强
 * 
 * @version 5.0.4.15
 * (1) 增强 net.ibizsys.paas.ctrlhandler.IEditFormHandler，添加loaddraftandcreate及loaddraftfromandcreate行为
 * 
 * @version 5.0.4.14
 * (1) 增强 net.ibizsys.paas.sysmodel.DynamicCodeListModelBase，添加PValue及DSCondition属性。
 * 
 * @version 5.0.4.13
 * (1)修复多项数据后台处理对象删除临时数据的权限检查问题
 * 
 * @version 5.0.4.12
 * (1)进一步细化无视图模式
 * 
 * @version 5.0.4.11
 * (1)net.ibizsys.paas.demodel.IDataEntityModel添加 getDEFieldConditionSql，用于支持实体模型重写字段查询条件的功能
 * (2)实体支持无视图模式，net.ibizsys.paas.core.IDataEntity、net.ibizsys.paas.core.IDEDataQuery 及相应处理进行调整。
 * 
 * @version 5.0.4.10
 * (1) net.ibizsys.paas.service.IService 增加 syncData 方法用于处理同步传入的数据，ServiceBase提供默认实现。
 * (2) 消息发送等后台作业服务修复启动计时器方式。
 * 
 * @version 5.0.4.9
 * (1) 增强数据同步功能
 * 
 * @version 5.0.4.8
 * (1) 修复联合键值属性更新的问题（实体主键为物理类型）
 * 
 * @version 5.0.4.7
 * (1) 代码表项 net.ibizsys.paas.codelist.ICodeItem 添加 isDisableSelect 属性，用于标示该项是否被禁止选择。 
 *
 * @version 5.0.4.6
 * (1) 修复虚拟主键的检查问题
 * 
 * @version 5.0.4.5
 * (1) 增强现有数据结构支持，对于现有多主键对象提供虚拟主键支持。
 * 
 * @version 5.0.4.4
 * (1) 系统模型基类 net.ibizsys.paas.sysmodel.SystemModelBase 增强，支持多数据源注入
 * 
 * @version 5.0.4.3
 * (1) 修复列表，表格，视图等数据项获取实体模型对象问题，从部件模型中获取实体模型，而非视图控制器
 * (2) 视图控制器添加 getDEDataAccessActions 方法，用于获取对于视图中对应实体的数据访问行为（用于下发权限控制）
 * (3) 调整 net.ibizsys.paas.ctrlmodel.GridDataItemModel，调整输出权限控制结果
 * (4) 修复浮点值校验，去除格式化后的逗号。
 * 
 * @version 5.0.4.2
 * (1) 树视图部件增强删除节点能力
 * 
 * @version 5.0.4.1
 * (1) net.ibizsys.paas.service.ServiceBase  增强数据集合值规则检查
 * (2) 进一步增强行编辑后台能力，添加自动填充等后台处理对象
 * 
 * @version 5.0.4.0
 * (1) 扩展相关运行实体保留字段
 * 
 * @version 5.0.3.9
 * (1) 工作流添加选择操作视图控制器
 * (2) 修复自定义部件后台处理对象
 * 
 * @version 5.0.3.8
 * (1) 增强JasperReport报表输出
 * (2) 增加向导面板、向导视图等相关功能
 * 
 * 
 * @version 5.0.3.7
 * (1) 增加1:1关系相关对象
 * (2) 增强部件项权限控制
 * 
 * @version 5.0.3.6
 * (1) 增加自定义部件相关对象
 * 
 * @version 5.0.3.5
 * (1) net.ibizsys.paas.util.JSONObjectHelper 添加新的put方法
 * 
 * 
 * @version 5.0.3.4
 * (1) 提供对JQuery R2的默认支持
 * (2) 修复工作流表格视图多项数据批操作（有弹出窗口）问题
 * 
 * @version 5.0.3.3
 * (1) 修复统一认证组件多服务器模式路径的问题
 * 
 * @version 5.0.3.2
 * (1) 调整工作流处理节点组条件，组逻辑在无任何子逻辑的情况下值为TRUE。
 * 
 * @version 5.0.3.1
 * (1) 调整工作流处理节点组条件，组逻辑在无任何子逻辑的情况下值为TRUE。
 * 
 * @version 5.0.3.0
 * (1) 编辑表单默认添加 srfsourcekey ，用于标注新建数据的来源（如果是复制）
 * (2) IService 增加copyDetails 方法，create 方法中，如传入参数中存在属性 srfsourcekey ,则会调用此方法进一步复制源数据的明细
 * 
 * @version 5.0.2.0
 * (1) 添加实体数据变更日志等实体
 * (2) 修复工作流处理节点组条件（OR）判断异常的问题
 * (3) 增加了数据变更派发相关功能
 * 
 * 
 * @version 5.0.1.103
 * (1) 完成视图更新面板后台处理对象  net.ibizsys.paas.ctrlhandler.UpdatePanelHandler
 * (2) 添加消息模板全局管理对象 net.ibizsys.psmsg.util.MsgTemplateGlobal
 * 
 * @version 5.0.1.102
 * (1) 添加系统间数据同步、定时任务调度等相关实体
 * (2) 修复获取多项代码表文本的错误
 * (3) 添加视图更新面板相关
 * 
 * @version 5.0.1.100
 * (1) 添加了表格行编辑能力
 */
public class Version
{
	public final static Integer MAJOR = 5;
	public final static Integer MINOR = 0;
	public final static Integer FUNC = 9;
	public final static Integer FIX = 6;
	public final static Integer DATE = 170720;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return StringHelper.format("%1$s.%2$s.%3$s.%4$s",MAJOR,MINOR,FUNC,FIX);
	}
	
	/**
	 * 输出版本字符串
	 * @return
	 */
	public static String toVersionString()
	{
		return StringHelper.format("%1$s.%2$s.%3$s.%4$s",MAJOR,MINOR,FUNC,FIX);
	}
}
