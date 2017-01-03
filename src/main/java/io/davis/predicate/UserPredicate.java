package io.davis.predicate;

import com.querydsl.core.types.Expression;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.PathBuilder;

import io.davis.entity.User;

/**
 * Created by Davis on 17/1/3.
 */
public class UserPredicate {
  public static BooleanExpression getByName(String name) {
    PathBuilder<User> entityPath = new PathBuilder<User>(User.class, "user");
    Expression propExpression = null;
    Expression valueEx = null;
    propExpression = entityPath.getString("name");
    valueEx = Expressions.constant(name);
    return Expressions.predicate(Ops.EQ, propExpression, valueEx);
  }
}
