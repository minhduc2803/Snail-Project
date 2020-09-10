import React, {useEffect} from 'react';
import shave from 'shave';

import './ConversationListItem.css';

export default function ConversationListItem(props) {
  useEffect(() => {
    shave('.conversation-snippet', 20);
  })

    const { photo,name,text,Token,UserID,ChatList } = props.data;

    return (
      <div className = {(UserID === props.key) ? "conversation-list-item"
                                            :
                                            "conversation-list-item conversation-list-item"}
                                            onClick={() => props.chosen(UserID)}>
        <img className="conversation-photo" src={photo} alt="" />
        <div className="conversation-info">
          <h1 className="conversation-title">{ name }</h1>
          <p className="conversation-snippet">{ text }</p>
        </div>
      </div>
    );
}