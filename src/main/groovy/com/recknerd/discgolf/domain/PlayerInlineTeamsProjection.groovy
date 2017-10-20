/*
 * Copyright 2016 Lexmark International, Inc.  All rights reserved.
 */

package com.recknerd.discgolf.domain

import com.recknerd.discgolf.domain.entity.PlayerEntity
import com.recknerd.discgolf.domain.entity.TeamEntity
import org.springframework.data.rest.core.config.Projection

/**
 *
 */
@Projection(name = "inlineTeams", types = [ PlayerEntity ])
interface PlayerInlineTeamsProjection {
    Long id
    String name
    String email
    Set<TeamEntity> teams
}
