package com.chengjs.rpc.base.server;

/**
 * 服务端处理器的标准接口，{@link GenericServer} 接到的任何请求都由此类处理，处理具体的业务逻辑。
 * 
 * @author: Chengjs, version:1.0.0, 2017/4/22
 */
public interface ServerProcessor<P, R> {

	/**
	 * @param param 客户端发来的数据
	 * 
	 * @return 将要返回给客户端的数据，包括异常信息。
	 * 
	 * @throws Throwable 未知异常（不建议抛出异常）
	 */
	public abstract R process(P param) throws Throwable;

}