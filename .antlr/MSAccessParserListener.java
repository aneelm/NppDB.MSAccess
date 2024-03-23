// Generated from c:/Users/Andres/Documents/bcS/NppDB/NppDB.MSAccess/MSAccessParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MSAccessParser}.
 */
public interface MSAccessParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(MSAccessParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(MSAccessParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(MSAccessParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(MSAccessParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(MSAccessParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(MSAccessParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#literal_expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_expr(MSAccessParser.Literal_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#literal_expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_expr(MSAccessParser.Literal_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(MSAccessParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(MSAccessParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(MSAccessParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(MSAccessParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(MSAccessParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(MSAccessParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(MSAccessParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(MSAccessParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(MSAccessParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(MSAccessParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(MSAccessParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(MSAccessParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(MSAccessParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(MSAccessParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_name(MSAccessParser.Procedure_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#procedure_name}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_name(MSAccessParser.Procedure_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#param_name}.
	 * @param ctx the parse tree
	 */
	void enterParam_name(MSAccessParser.Param_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#param_name}.
	 * @param ctx the parse tree
	 */
	void exitParam_name(MSAccessParser.Param_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(MSAccessParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(MSAccessParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(MSAccessParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(MSAccessParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#aliased_table_name}.
	 * @param ctx the parse tree
	 */
	void enterAliased_table_name(MSAccessParser.Aliased_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#aliased_table_name}.
	 * @param ctx the parse tree
	 */
	void exitAliased_table_name(MSAccessParser.Aliased_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(MSAccessParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(MSAccessParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(MSAccessParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(MSAccessParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(MSAccessParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(MSAccessParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#param_def}.
	 * @param ctx the parse tree
	 */
	void enterParam_def(MSAccessParser.Param_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#param_def}.
	 * @param ctx the parse tree
	 */
	void exitParam_def(MSAccessParser.Param_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#optional_parens}.
	 * @param ctx the parse tree
	 */
	void enterOptional_parens(MSAccessParser.Optional_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#optional_parens}.
	 * @param ctx the parse tree
	 */
	void exitOptional_parens(MSAccessParser.Optional_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#default_expr}.
	 * @param ctx the parse tree
	 */
	void enterDefault_expr(MSAccessParser.Default_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#default_expr}.
	 * @param ctx the parse tree
	 */
	void exitDefault_expr(MSAccessParser.Default_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(MSAccessParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(MSAccessParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#prefixed_star}.
	 * @param ctx the parse tree
	 */
	void enterPrefixed_star(MSAccessParser.Prefixed_starContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#prefixed_star}.
	 * @param ctx the parse tree
	 */
	void exitPrefixed_star(MSAccessParser.Prefixed_starContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#prefixed_column_name}.
	 * @param ctx the parse tree
	 */
	void enterPrefixed_column_name(MSAccessParser.Prefixed_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#prefixed_column_name}.
	 * @param ctx the parse tree
	 */
	void exitPrefixed_column_name(MSAccessParser.Prefixed_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(MSAccessParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(MSAccessParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void enterParam_expr(MSAccessParser.Param_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#param_expr}.
	 * @param ctx the parse tree
	 */
	void exitParam_expr(MSAccessParser.Param_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(MSAccessParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(MSAccessParser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#group_name}.
	 * @param ctx the parse tree
	 */
	void enterGroup_name(MSAccessParser.Group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#group_name}.
	 * @param ctx the parse tree
	 */
	void exitGroup_name(MSAccessParser.Group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#user_or_group_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_group_name(MSAccessParser.User_or_group_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#user_or_group_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_group_name(MSAccessParser.User_or_group_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(MSAccessParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(MSAccessParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#pid}.
	 * @param ctx the parse tree
	 */
	void enterPid(MSAccessParser.PidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#pid}.
	 * @param ctx the parse tree
	 */
	void exitPid(MSAccessParser.PidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MSAccessParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MSAccessParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_expr(MSAccessParser.Function_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#function_expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_expr(MSAccessParser.Function_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#create_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_stmt(MSAccessParser.Create_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#create_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_stmt(MSAccessParser.Create_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#create_group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_group_stmt(MSAccessParser.Create_group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#create_group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_group_stmt(MSAccessParser.Create_group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#drop_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_stmt(MSAccessParser.Drop_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#drop_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_stmt(MSAccessParser.Drop_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#drop_group_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_group_stmt(MSAccessParser.Drop_group_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#drop_group_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_group_stmt(MSAccessParser.Drop_group_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#alter_password_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_password_stmt(MSAccessParser.Alter_password_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#alter_password_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_password_stmt(MSAccessParser.Alter_password_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#add_user_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAdd_user_stmt(MSAccessParser.Add_user_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#add_user_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAdd_user_stmt(MSAccessParser.Add_user_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void enterGrant_stmt(MSAccessParser.Grant_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#grant_stmt}.
	 * @param ctx the parse tree
	 */
	void exitGrant_stmt(MSAccessParser.Grant_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#revoke_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_stmt(MSAccessParser.Revoke_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#revoke_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_stmt(MSAccessParser.Revoke_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(MSAccessParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(MSAccessParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(MSAccessParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(MSAccessParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(MSAccessParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(MSAccessParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(MSAccessParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(MSAccessParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#on_trigger}.
	 * @param ctx the parse tree
	 */
	void enterOn_trigger(MSAccessParser.On_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#on_trigger}.
	 * @param ctx the parse tree
	 */
	void exitOn_trigger(MSAccessParser.On_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#single_field_constraint}.
	 * @param ctx the parse tree
	 */
	void enterSingle_field_constraint(MSAccessParser.Single_field_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#single_field_constraint}.
	 * @param ctx the parse tree
	 */
	void exitSingle_field_constraint(MSAccessParser.Single_field_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#multiple_field_constraint}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_field_constraint(MSAccessParser.Multiple_field_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#multiple_field_constraint}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_field_constraint(MSAccessParser.Multiple_field_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExec_stmt(MSAccessParser.Exec_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#exec_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExec_stmt(MSAccessParser.Exec_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(MSAccessParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(MSAccessParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(MSAccessParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(MSAccessParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(MSAccessParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(MSAccessParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure_stmt(MSAccessParser.Create_procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#create_procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure_stmt(MSAccessParser.Create_procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_stmt(MSAccessParser.Drop_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#drop_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_stmt(MSAccessParser.Drop_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(MSAccessParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(MSAccessParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTable_stmt(MSAccessParser.Table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTable_stmt(MSAccessParser.Table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#table_core_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTable_core_stmt(MSAccessParser.Table_core_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#table_core_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTable_core_stmt(MSAccessParser.Table_core_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void enterSelect_clause(MSAccessParser.Select_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#select_clause}.
	 * @param ctx the parse tree
	 */
	void exitSelect_clause(MSAccessParser.Select_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#select_into_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_into_stmt(MSAccessParser.Select_into_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#select_into_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_into_stmt(MSAccessParser.Select_into_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#select_core_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core_stmt(MSAccessParser.Select_core_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#select_core_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core_stmt(MSAccessParser.Select_core_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(MSAccessParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(MSAccessParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#table_with_joins}.
	 * @param ctx the parse tree
	 */
	void enterTable_with_joins(MSAccessParser.Table_with_joinsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#table_with_joins}.
	 * @param ctx the parse tree
	 */
	void exitTable_with_joins(MSAccessParser.Table_with_joinsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(MSAccessParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(MSAccessParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(MSAccessParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(MSAccessParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(MSAccessParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(MSAccessParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(MSAccessParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(MSAccessParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(MSAccessParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(MSAccessParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(MSAccessParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(MSAccessParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(MSAccessParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(MSAccessParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(MSAccessParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(MSAccessParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_stmt(MSAccessParser.Procedure_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#procedure_stmt}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_stmt(MSAccessParser.Procedure_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#parameters_stmt}.
	 * @param ctx the parse tree
	 */
	void enterParameters_stmt(MSAccessParser.Parameters_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#parameters_stmt}.
	 * @param ctx the parse tree
	 */
	void exitParameters_stmt(MSAccessParser.Parameters_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(MSAccessParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(MSAccessParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(MSAccessParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(MSAccessParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MSAccessParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(MSAccessParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MSAccessParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(MSAccessParser.ParseContext ctx);
}