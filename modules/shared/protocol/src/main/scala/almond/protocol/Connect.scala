package almond.protocol

object Connect {

  case object Request

  final case class Reply(
    shell_port: Int,
    iopub_port: Int,
    stdin_port: Int,
    hb_port: Int
  )


  def requestType = MessageType[Request.type]("connect_request")
  def replyType = MessageType[Reply]("connect_reply")

}
