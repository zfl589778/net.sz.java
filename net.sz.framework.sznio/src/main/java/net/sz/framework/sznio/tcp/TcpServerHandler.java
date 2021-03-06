package net.sz.framework.sznio.tcp;

import java.nio.channels.SelectionKey;
import net.sz.framework.sznio.NioSession;

/**
 *
 * <br>
 * author 失足程序员<br>
 * mail 492794628@qq.com<br>
 * phone 13882122019<br>
 */
public interface TcpServerHandler {

    /**
     * 简单处理器接口
     *
     * @author shirdrn
     */
    /**
     * 处理{@link SelectionKey#OP_ACCEPT}事件
     *
     * @param session
     */
    void handleAccept(NioSession session);

    /**
     *
     * @param session
     * @param ex
     */
    void handleClose(NioSession session, Exception ex);

    /**
     * 处理{@link SelectionKey#OP_READ}事件
     *
     * @param session
     * @param msgId
     * @param array
     */
    void handleRead(NioSession session, int msgId, byte[] array);

}
