import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ChatBox {
    ChatBox(){

    }
    public JLayeredPane MainChatBox(){

        JLayeredPane baseChatLayer = new JLayeredPane();
        baseChatLayer.setLayout(new FlowLayout());
        baseChatLayer.setPreferredSize(new Dimension(420,620));
        baseChatLayer.setBorder(new EmptyBorder(0,25,0,0));

        JPanel basePanel = new JPanel();
        basePanel.setPreferredSize(new Dimension(400,600));
        basePanel.setBackground(new Color(68,114,196));

        JPanel savedChatPanel = new JPanel();
        savedChatPanel.setPreferredSize(new Dimension(385, 535));
        savedChatPanel.setBackground(new Color(143,170,220));
        //savedChatPanel.setBorder(BorderFactory.createLineBorder(new Color(68,114,196),5));

        JTextArea chatBox = new JTextArea("Chat");
        chatBox.setPreferredSize(new Dimension(305,50));
        chatBox.setBackground(Color.white);
        chatBox.setBorder(BorderFactory.createLineBorder(new Color(68,114,196),5));

        JButton sendButton = new JButton("Send");
        sendButton.setBackground(Color.red);
        sendButton.setPreferredSize(new Dimension(80,50));
        sendButton.setBorder(BorderFactory.createLineBorder(new Color(68,114,196),5));

        basePanel.add(savedChatPanel);
        basePanel.add(chatBox);
        basePanel.add(sendButton);

        baseChatLayer.add(basePanel);

        return baseChatLayer;
    }

}
