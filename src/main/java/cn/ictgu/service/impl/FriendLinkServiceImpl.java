package cn.ictgu.service.impl;

import cn.ictgu.service.mapper.FriendLinkMapper;
import cn.ictgu.service.model.FriendLink;
import cn.ictgu.service.FriendLinkService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 友情链接
 */
@Service
@Slf4j
@AllArgsConstructor
public class FriendLinkServiceImpl implements FriendLinkService {

    private final FriendLinkMapper friendLinkMapper;

    public List<FriendLink> listHome() {
        return friendLinkMapper.selectShowEqYesDesc();
    }


}
